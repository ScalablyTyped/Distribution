package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use {@link com.sun.star.reflection.XIdlField2} instead.
  * @deprecated Deprecated
  */
trait XIdlField extends XIdlMember {
  val AccessMode: FieldAccessMode
  val Type: XIdlClass[_]
  def get(obj: js.Any): js.Any
  def getAccessMode(): FieldAccessMode
  def getType(): XIdlClass[_]
  def set(obj: js.Any, value: js.Any): scala.Unit
}

