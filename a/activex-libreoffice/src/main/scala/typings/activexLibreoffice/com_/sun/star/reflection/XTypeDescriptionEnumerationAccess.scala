package typings.activexLibreoffice.com_.sun.star.reflection

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.TypeClass
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an interface for creating enumerations for type descriptions.
  * @since OOo 1.1.2
  */
@js.native
trait XTypeDescriptionEnumerationAccess extends XInterface {
  
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
  def createTypeDescriptionEnumeration(moduleName: String, types: SeqEquiv[TypeClass], depth: TypeDescriptionSearchDepth): XTypeDescriptionEnumeration = js.native
}
object XTypeDescriptionEnumerationAccess {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createTypeDescriptionEnumeration: (String, SeqEquiv[TypeClass], TypeDescriptionSearchDepth) => XTypeDescriptionEnumeration,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTypeDescriptionEnumerationAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createTypeDescriptionEnumeration = js.Any.fromFunction3(createTypeDescriptionEnumeration), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTypeDescriptionEnumerationAccess]
  }
  
  @scala.inline
  implicit class XTypeDescriptionEnumerationAccessOps[Self <: XTypeDescriptionEnumerationAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateTypeDescriptionEnumeration(value: (String, SeqEquiv[TypeClass], TypeDescriptionSearchDepth) => XTypeDescriptionEnumeration): Self = this.set("createTypeDescriptionEnumeration", js.Any.fromFunction3(value))
  }
}
