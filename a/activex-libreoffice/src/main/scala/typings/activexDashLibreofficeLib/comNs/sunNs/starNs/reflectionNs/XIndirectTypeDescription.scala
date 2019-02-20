package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reflects a typedef or sequence type. The type class of this description is TypeClass_TYPEDEF or TypeClass_SEQUENCE. */
trait XIndirectTypeDescription extends XTypeDescription {
  /**
    * Returns the typedefed type, if the type is a typedef, or the element type, if the type is a sequence.
    * @returns referenced type
    */
  val ReferencedType: XTypeDescription
  /**
    * Returns the typedefed type, if the type is a typedef, or the element type, if the type is a sequence.
    * @returns referenced type
    */
  def getReferencedType(): XTypeDescription
}

