package typings.androiduix.androidui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.util")
@js.native
object util extends js.Object {
  @js.native
  class ArrayCreator () extends js.Object
  
  @js.native
  class ClassFinder () extends js.Object
  
  @js.native
  class NumberChecker () extends js.Object
  
  @js.native
  class PerformanceAdjuster () extends js.Object
  
  @js.native
  class Platform () extends js.Object
  
  /* static members */
  @js.native
  object ArrayCreator extends js.Object {
    def fillArray(array: js.Array[_], value: js.Any): Unit = js.native
    def newBooleanArray(size: Double): js.Array[Boolean] = js.native
    def newNumberArray(size: Double): js.Array[Double] = js.native
  }
  
  /* static members */
  @js.native
  object ClassFinder extends js.Object {
    def findClass(classFullName: String): js.Any = js.native
    def findClass(classFullName: String, findInRoot: js.Any): js.Any = js.native
    def findViewClass(className: String): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object NumberChecker extends js.Object {
    def assetNotNumber(ns: Double*): Unit = js.native
    def checkIsNumber(ns: Double*): Boolean = js.native
    def warnNotNumber(n: Double*): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object PerformanceAdjuster extends js.Object {
    def noCanvasMode(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Platform extends js.Object {
    var isAndroid: Boolean = js.native
    var isIOS: Boolean = js.native
    var isWeChat: Boolean = js.native
  }
  
}

