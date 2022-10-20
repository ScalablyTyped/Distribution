package typings.animejs

import org.scalablytyped.runtime.StringDictionary
import typings.animejs.anon.El
import typings.animejs.mod.AnimeInstance
import typings.animejs.mod.AnimeParams
import typings.animejs.mod.AnimeTarget
import typings.animejs.mod.AnimeTimelineInstance
import typings.animejs.mod.FunctionBasedParameter
import typings.animejs.mod.StaggerOptions
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimeMod {
  
  inline def apply(params: AnimeParams): AnimeInstance = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[AnimeInstance]
  
  @JSImport("animejs/lib/anime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bezier(x1: Double, y1: Double, x2: Double, y2: Double): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("bezier")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  
  inline def get(targets: AnimeTarget, prop: String): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(targets.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  inline def path(): js.Function1[/* prop */ String, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("path")().asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: String): js.Function1[/* prop */ String, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: String, percent: Double): js.Function1[/* prop */ String, El] = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: Null, percent: Double): js.Function1[/* prop */ String, El] = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: HTMLElement): js.Function1[/* prop */ String, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: HTMLElement, percent: Double): js.Function1[/* prop */ String, El] = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: SVGElement): js.Function1[/* prop */ String, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: SVGElement, percent: Double): js.Function1[/* prop */ String, El] = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* prop */ String, El]]
  
  inline def random(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def remove(targets: js.Array[AnimeTarget]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(targets.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def remove(targets: AnimeTarget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(targets.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("animejs/lib/anime", "running")
  @js.native
  val running: js.Array[AnimeInstance] = js.native
  
  inline def set(targets: AnimeTarget, value: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(targets.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDashoffset(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setDashoffset")().asInstanceOf[Double]
  inline def setDashoffset(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setDashoffset")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def setDashoffset(el: SVGElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setDashoffset")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("animejs/lib/anime", "speed")
  @js.native
  val speed: Double = js.native
  
  inline def stagger(value: String): FunctionBasedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: String, options: StaggerOptions): FunctionBasedParameter = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: js.Array[Double | String]): FunctionBasedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: js.Array[Double | String], options: StaggerOptions): FunctionBasedParameter = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: Double): FunctionBasedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: Double, options: StaggerOptions): FunctionBasedParameter = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionBasedParameter]
  
  // Timeline
  inline def timeline(): AnimeTimelineInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("timeline")().asInstanceOf[AnimeTimelineInstance]
  inline def timeline(params: js.Array[AnimeInstance]): AnimeTimelineInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("timeline")(params.asInstanceOf[js.Any]).asInstanceOf[AnimeTimelineInstance]
  inline def timeline(params: AnimeParams): AnimeTimelineInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("timeline")(params.asInstanceOf[js.Any]).asInstanceOf[AnimeTimelineInstance]
  
  // Helpers
  @JSImport("animejs/lib/anime", "version")
  @js.native
  val version: String = js.native
}
