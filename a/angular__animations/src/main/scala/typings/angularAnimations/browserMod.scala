package typings.angularAnimations

import org.scalablytyped.runtime.StringDictionary
import typings.angularAnimations.mod.AnimationMetadata
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@angular/animations/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/animations/browser", "AnimationDriver")
  @js.native
  abstract class AnimationDriver ()
    extends typings.angularAnimations.browserBrowserMod.AnimationDriver
  /* static members */
  object AnimationDriver {
    
    @JSImport("@angular/animations/browser", "AnimationDriver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/animations/browser", "AnimationDriver.NOOP")
    @js.native
    def NOOP: typings.angularAnimations.browserBrowserMod.AnimationDriver = js.native
    @scala.inline
    def NOOP_=(x: typings.angularAnimations.browserBrowserMod.AnimationDriver): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOOP")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/animations/browser", "\u0275Animation")
  @js.native
  class ɵAnimation protected ()
    extends typings.angularAnimations.browserBrowserMod.ɵAnimation {
    def this(
      _driver: typings.angularAnimations.browserBrowserMod.AnimationDriver,
      input: js.Array[AnimationMetadata]
    ) = this()
    def this(_driver: typings.angularAnimations.browserBrowserMod.AnimationDriver, input: AnimationMetadata) = this()
  }
  
  @JSImport("@angular/animations/browser", "\u0275AnimationEngine")
  @js.native
  class ɵAnimationEngine protected ()
    extends typings.angularAnimations.browserBrowserMod.ɵAnimationEngine {
    def this(
      bodyNode: js.Any,
      _driver: typings.angularAnimations.browserBrowserMod.AnimationDriver,
      normalizer: typings.angularAnimations.browserBrowserMod.ɵAnimationStyleNormalizer
    ) = this()
  }
  
  @JSImport("@angular/animations/browser", "\u0275AnimationStyleNormalizer")
  @js.native
  abstract class ɵAnimationStyleNormalizer ()
    extends typings.angularAnimations.browserBrowserMod.ɵAnimationStyleNormalizer
  
  @JSImport("@angular/animations/browser", "\u0275CssKeyframesDriver")
  @js.native
  class ɵCssKeyframesDriver ()
    extends typings.angularAnimations.browserBrowserMod.ɵCssKeyframesDriver
  
  @JSImport("@angular/animations/browser", "\u0275CssKeyframesPlayer")
  @js.native
  class ɵCssKeyframesPlayer protected ()
    extends typings.angularAnimations.browserBrowserMod.ɵCssKeyframesPlayer {
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      animationName: String,
      _duration: Double,
      _delay: Double,
      easing: String,
      _finalStyles: StringDictionary[js.Any]
    ) = this()
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      animationName: String,
      _duration: Double,
      _delay: Double,
      easing: String,
      _finalStyles: StringDictionary[js.Any],
      _specialStyles: typings.angularAnimations.browserBrowserMod.ɵangularPackagesAnimationsBrowserBrowserA
    ) = this()
  }
  
  @JSImport("@angular/animations/browser", "\u0275NoopAnimationDriver")
  @js.native
  class ɵNoopAnimationDriver ()
    extends typings.angularAnimations.browserBrowserMod.ɵNoopAnimationDriver
  
  @JSImport("@angular/animations/browser", "\u0275NoopAnimationStyleNormalizer")
  @js.native
  class ɵNoopAnimationStyleNormalizer ()
    extends typings.angularAnimations.browserBrowserMod.ɵNoopAnimationStyleNormalizer
  
  @JSImport("@angular/animations/browser", "\u0275WebAnimationsDriver")
  @js.native
  class ɵWebAnimationsDriver ()
    extends typings.angularAnimations.browserBrowserMod.ɵWebAnimationsDriver
  
  @JSImport("@angular/animations/browser", "\u0275WebAnimationsPlayer")
  @js.native
  class ɵWebAnimationsPlayer protected ()
    extends typings.angularAnimations.browserBrowserMod.ɵWebAnimationsPlayer {
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      options: StringDictionary[String | Double]
    ) = this()
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      options: StringDictionary[String | Double],
      _specialStyles: typings.angularAnimations.browserBrowserMod.ɵangularPackagesAnimationsBrowserBrowserA
    ) = this()
  }
  
  @JSImport("@angular/animations/browser", "\u0275WebAnimationsStyleNormalizer")
  @js.native
  class ɵWebAnimationsStyleNormalizer ()
    extends typings.angularAnimations.browserBrowserMod.ɵWebAnimationsStyleNormalizer
  
  @scala.inline
  def ɵallowPreviousPlayerStylesMerge(duration: Double, delay: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowPreviousPlayerStylesMerge")(duration.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@angular/animations/browser", "\u0275angular_packages_animations_browser_browser_a")
  @js.native
  class ɵangularPackagesAnimationsBrowserBrowserA protected ()
    extends typings.angularAnimations.browserBrowserMod.ɵangularPackagesAnimationsBrowserBrowserA {
    def this(_element: js.Any) = this()
    def this(_element: js.Any, _startStyles: StringDictionary[js.Any]) = this()
    def this(_element: js.Any, _startStyles: StringDictionary[js.Any], _endStyles: StringDictionary[js.Any]) = this()
    def this(_element: js.Any, _startStyles: Null, _endStyles: StringDictionary[js.Any]) = this()
  }
  /* static members */
  object ɵangularPackagesAnimationsBrowserBrowserA {
    
    @JSImport("@angular/animations/browser", "\u0275angular_packages_animations_browser_browser_a")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/animations/browser", "\u0275angular_packages_animations_browser_browser_a.initialStylesByElement")
    @js.native
    def initialStylesByElement: WeakMap[js.Any, StringDictionary[js.Any]] = js.native
    @scala.inline
    def initialStylesByElement_=(x: WeakMap[js.Any, StringDictionary[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialStylesByElement")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def ɵcontainsElement(elm1: js.Any, elm2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275containsElement")(elm1.asInstanceOf[js.Any], elm2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def ɵinvokeQuery(element: js.Any, selector: String, multi: Boolean): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275invokeQuery")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def ɵmatchesElement(element: js.Any, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275matchesElement")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def ɵsupportsWebAnimations(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275supportsWebAnimations")().asInstanceOf[Boolean]
  
  @scala.inline
  def ɵvalidateStyleProperty(prop: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275validateStyleProperty")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
