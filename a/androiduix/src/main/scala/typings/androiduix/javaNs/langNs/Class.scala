package typings.androiduix.javaNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("java.lang.Class")
@js.native
class Class protected () extends js.Object {
  def this(clazz: js.Function) = this()
  var clazz: js.Function = js.native
  def getName(): String = js.native
  def getSimpleName(): String = js.native
}

/* static members */
@JSGlobal("java.lang.Class")
@js.native
object Class extends js.Object {
  var classCache: js.Any = js.native
  /* private */ def getClass(clazz: js.Any): js.Any = js.native
}

