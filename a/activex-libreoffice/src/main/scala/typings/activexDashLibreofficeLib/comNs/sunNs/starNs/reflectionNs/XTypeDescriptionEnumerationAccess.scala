package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an interface for creating enumerations for type descriptions.
  * @since OOo 1.1.2
  */
trait XTypeDescriptionEnumerationAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Creates an enumeration for type descriptions.
    *
    * An enumeration is always created for an UNOIDL module. The enumeration contents can be restricted by specifying type classes. Only types that match
    * one of the supplied type classes will be part of the collection. Additionally, it is possible to specify the depth for the search within the
    * underlying type description tree.
    * @param moduleName contains the name of an UNOIDL module. Modules are separated by a single '.' (i.e., "com.sun.star.reflection"). The root of the module
    * @param types restricts the contents of the enumeration. It will only contain type descriptions that match one of the supplied type classes. An empty seq
    * @param depth specifies the depth of search in the underlying tree of type descriptions. Clients should be aware of the fact that specifying TypeDescript
    * @returns an enumeration of type descriptions.  The enumeration returns implementations of {@link XTypeDescription} . Following concrete UNOIDL parts repre
    * @throws NoSuchTypeNameException in case that the given module name does not exist. This exception will never be thrown in case moduleName is the empty string.
    * @throws InvalidTypeNameException in case that the given module name does exist, but does not specify an UNOIDL module. This exception will never be throw
    */
  def createTypeDescriptionEnumeration(
    moduleName: java.lang.String,
    types: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass],
    depth: TypeDescriptionSearchDepth
  ): XTypeDescriptionEnumeration
}

object XTypeDescriptionEnumerationAccess {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createTypeDescriptionEnumeration: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass], 
      TypeDescriptionSearchDepth, 
      XTypeDescriptionEnumeration
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTypeDescriptionEnumerationAccess = {
    val __obj = js.Dynamic.literal(acquire = acquire, createTypeDescriptionEnumeration = createTypeDescriptionEnumeration, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTypeDescriptionEnumerationAccess]
  }
}

