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

object XIdlField {
  @scala.inline
  def apply(
    AccessMode: FieldAccessMode,
    DeclaringClass: XIdlClass[_],
    Name: java.lang.String,
    Type: XIdlClass[_],
    acquire: js.Function0[scala.Unit],
    get: js.Function1[js.Any, js.Any],
    getAccessMode: js.Function0[FieldAccessMode],
    getDeclaringClass: js.Function0[XIdlClass[_]],
    getName: js.Function0[java.lang.String],
    getType: js.Function0[XIdlClass[_]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    set: js.Function2[js.Any, js.Any, scala.Unit]
  ): XIdlField = {
    val __obj = js.Dynamic.literal(AccessMode = AccessMode, DeclaringClass = DeclaringClass, Name = Name, Type = Type, acquire = acquire, get = get, getAccessMode = getAccessMode, getDeclaringClass = getDeclaringClass, getName = getName, getType = getType, queryInterface = queryInterface, release = release, set = set)
  
    __obj.asInstanceOf[XIdlField]
  }
}

