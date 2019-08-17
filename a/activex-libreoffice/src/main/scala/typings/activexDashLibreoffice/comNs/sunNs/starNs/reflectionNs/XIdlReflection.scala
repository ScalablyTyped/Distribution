package typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface to reflect types.
  * @see CoreReflection
  * @see XIdlClass
  */
@js.native
trait XIdlReflection extends XInterface {
  /**
    * Obtaining a reflection interface for a type. You specify the type by its name. If the given type name can not be reflected, then a null-reference is
    * returned.
    * @param aTypeName the type's name
    * @returns reflection interface for the demanded type (or null)
    */
  def forName(aTypeName: String): XIdlClass[_] = js.native
  def forName[K /* <: String */](aTypeName: K): XIdlClass[
    /* import warning: ImportType.apply Failed type conversion: activex-libreoffice.LibreOffice.InstantiableNameMap[K] */ js.Any
  ] = js.native
  /**
    * Obtaining a reflection interface for an object. This method takes the type of the object the any contains into account. If the any contains no object,
    * then a null-reference is returned.
    * @param aObj an object
    * @returns reflection interface of the type of the demanded object (or null)
    */
  def getType(aObj: js.Any): XIdlClass[_] = js.native
}

