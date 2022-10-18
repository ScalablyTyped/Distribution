package typings.antvG2plot

import typings.antvG2plot.anon.OptionscoordinateTransfor
import typings.antvG2plot.anon.PickOptionsanimation
import typings.antvG2plot.anon.PickOptionsannotations
import typings.antvG2plot.anon.PickOptionsinteractions
import typings.antvG2plot.anon.PickOptionslabellegendmet
import typings.antvG2plot.anon.PickOptionslegendcolorFie
import typings.antvG2plot.anon.PickOptionsmeta
import typings.antvG2plot.anon.PickOptionstheme
import typings.antvG2plot.anon.PickOptionstooltip
import typings.antvG2plot.antvG2plotStrings.cartesian
import typings.antvG2plot.antvG2plotStrings.helix
import typings.antvG2plot.antvG2plotStrings.polar
import typings.antvG2plot.antvG2plotStrings.rect
import typings.antvG2plot.antvG2plotStrings.theta
import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libTypesAnnotationMod.Annotation
import typings.antvG2plot.libTypesAxisMod.Axis
import typings.antvG2plot.libTypesCommonMod.Options
import typings.antvG2plot.libTypesMetaMod.Meta
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptorCommonMod {
  
  @JSImport("@antv/g2plot/lib/adaptor/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def animation[O /* <: PickOptionsanimation */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("animation")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  inline def annotation(): js.Function1[/* params */ Params[PickOptionsannotations], Params[PickOptionsannotations]] = ^.asInstanceOf[js.Dynamic].applyDynamic("annotation")().asInstanceOf[js.Function1[/* params */ Params[PickOptionsannotations], Params[PickOptionsannotations]]]
  inline def annotation(annotationOptions: js.UndefOr[js.Array[Annotation]]): js.Function1[/* params */ Params[PickOptionsannotations], Params[PickOptionsannotations]] = ^.asInstanceOf[js.Dynamic].applyDynamic("annotation")(annotationOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ Params[PickOptionsannotations], Params[PickOptionsannotations]]]
  
  inline def interaction[O /* <: PickOptionsinteractions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("interaction")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  inline def legend[O /* <: PickOptionslegendcolorFie */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("legend")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  inline def limitInPlot(params: Params[Options]): Params[Options] = ^.asInstanceOf[js.Dynamic].applyDynamic("limitInPlot")(params.asInstanceOf[js.Any]).asInstanceOf[Params[Options]]
  
  inline def pattern(key: String): js.Function1[/* params */ Params[PickOptionslabellegendmet], Params[PickOptionslabellegendmet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ Params[PickOptionslabellegendmet], Params[PickOptionslabellegendmet]]]
  
  inline def scale(axes: Record[String, Axis]): js.Function1[/* params */ Params[PickOptionsmeta], Params[PickOptionsmeta]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scale")(axes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ Params[PickOptionsmeta], Params[PickOptionsmeta]]]
  inline def scale(axes: Record[String, Axis], meta: js.UndefOr[Record[String, Meta]]): js.Function1[/* params */ Params[PickOptionsmeta], Params[PickOptionsmeta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(axes.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ Params[PickOptionsmeta], Params[PickOptionsmeta]]]
  
  inline def scrollbar(params: Params[Options]): Params[Options] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollbar")(params.asInstanceOf[js.Any]).asInstanceOf[Params[Options]]
  
  inline def slider(params: Params[Options]): Params[Options] = ^.asInstanceOf[js.Dynamic].applyDynamic("slider")(params.asInstanceOf[js.Any]).asInstanceOf[Params[Options]]
  
  inline def state[O /* <: Options */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("state")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  inline def theme[O /* <: PickOptionstheme */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("theme")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  inline def tooltip[O /* <: PickOptionstooltip */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  inline def transformations(): js.Function1[/* params */ Params[OptionscoordinateTransfor], Params[OptionscoordinateTransfor]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformations")().asInstanceOf[js.Function1[/* params */ Params[OptionscoordinateTransfor], Params[OptionscoordinateTransfor]]]
  inline def transformations(coordinateType: js.UndefOr[polar | theta | rect | cartesian | helix]): js.Function1[/* params */ Params[OptionscoordinateTransfor], Params[OptionscoordinateTransfor]] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformations")(coordinateType.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ Params[OptionscoordinateTransfor], Params[OptionscoordinateTransfor]]]
}
