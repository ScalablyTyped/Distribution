package typings.androiduix.global.androidui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object util {
  
  @JSGlobal("androidui.util.ArrayCreator")
  @js.native
  class ArrayCreator ()
    extends typings.androiduix.androidui.util.ArrayCreator
  object ArrayCreator {
    
    /* static member */
    @JSGlobal("androidui.util.ArrayCreator.fillArray")
    @js.native
    def fillArray(array: js.Array[_], value: js.Any): Unit = js.native
    
    /* static member */
    @JSGlobal("androidui.util.ArrayCreator.newBooleanArray")
    @js.native
    def newBooleanArray(size: Double): js.Array[Boolean] = js.native
    
    /* static member */
    @JSGlobal("androidui.util.ArrayCreator.newNumberArray")
    @js.native
    def newNumberArray(size: Double): js.Array[Double] = js.native
  }
  
  @JSGlobal("androidui.util.ClassFinder")
  @js.native
  class ClassFinder ()
    extends typings.androiduix.androidui.util.ClassFinder
  object ClassFinder {
    
    /* static member */
    @JSGlobal("androidui.util.ClassFinder.findClass")
    @js.native
    def findClass(classFullName: String): js.Any = js.native
    @JSGlobal("androidui.util.ClassFinder.findClass")
    @js.native
    def findClass(classFullName: String, findInRoot: js.Any): js.Any = js.native
    
    /* static member */
    @JSGlobal("androidui.util.ClassFinder.findViewClass")
    @js.native
    def findViewClass(className: String): js.Any = js.native
    
    /* static member */
    object findViewClassCache
  }
  
  @JSGlobal("androidui.util.NumberChecker")
  @js.native
  class NumberChecker ()
    extends typings.androiduix.androidui.util.NumberChecker
  object NumberChecker {
    
    /* static member */
    @JSGlobal("androidui.util.NumberChecker.assetNotNumber")
    @js.native
    def assetNotNumber(ns: Double*): Unit = js.native
    
    /* static member */
    @JSGlobal("androidui.util.NumberChecker.checkIsNumber")
    @js.native
    def checkIsNumber(ns: Double*): Boolean = js.native
    
    /* static member */
    @JSGlobal("androidui.util.NumberChecker.warnNotNumber")
    @js.native
    def warnNotNumber(n: Double*): Boolean = js.native
  }
  
  @JSGlobal("androidui.util.PerformanceAdjuster")
  @js.native
  class PerformanceAdjuster ()
    extends typings.androiduix.androidui.util.PerformanceAdjuster
  object PerformanceAdjuster {
    
    /* static member */
    @JSGlobal("androidui.util.PerformanceAdjuster.noCanvasMode")
    @js.native
    def noCanvasMode(): Unit = js.native
  }
  
  @JSGlobal("androidui.util.Platform")
  @js.native
  class Platform ()
    extends typings.androiduix.androidui.util.Platform
  object Platform {
    
    @JSGlobal("androidui.util.Platform")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("androidui.util.Platform.isAndroid")
    @js.native
    def isAndroid: Boolean = js.native
    @scala.inline
    def isAndroid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAndroid")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("androidui.util.Platform.isIOS")
    @js.native
    def isIOS: Boolean = js.native
    @scala.inline
    def isIOS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isIOS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("androidui.util.Platform.isWeChat")
    @js.native
    def isWeChat: Boolean = js.native
    @scala.inline
    def isWeChat_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isWeChat")(x.asInstanceOf[js.Any])
  }
}
