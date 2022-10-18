package typings.antvG2plot.mod

import typings.antvG2plot.anon.Fn0
import typings.antvG2plot.anon.Fn1
import typings.antvG2plot.anon.Fn2
import typings.antvG2plot.anon.FnCall
import typings.antvG2plot.anon.FnCallParams
import typings.antvG2plot.anon.PickOptionsanimation
import typings.antvG2plot.anon.PickOptionsannotations
import typings.antvG2plot.anon.PickOptionsinteractions
import typings.antvG2plot.anon.PickOptionslegendcolorFie
import typings.antvG2plot.anon.PickOptionsmeta
import typings.antvG2plot.anon.PickOptionstheme
import typings.antvG2plot.anon.PickOptionstooltip
import typings.antvG2plot.libCoreAdaptorMod.Params
import typings.antvG2plot.libTypesAnnotationMod.Annotation
import typings.antvG2plot.libTypesAxisMod.Axis
import typings.antvG2plot.libTypesMetaMod.Meta
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adaptors {
  
  @JSImport("@antv/g2plot", "adaptors")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g2plot", "adaptors.animation")
  @js.native
  def animation: Fn2 = js.native
  inline def animation[O /* <: PickOptionsanimation */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("animation")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  inline def animation_=(x: Fn2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animation")(x.asInstanceOf[js.Any])
  
  inline def annotation(): js.Function1[/* params */ Params[PickOptionsannotations], Params[PickOptionsannotations]] = ^.asInstanceOf[js.Dynamic].applyDynamic("annotation")().asInstanceOf[js.Function1[/* params */ Params[PickOptionsannotations], Params[PickOptionsannotations]]]
  inline def annotation(annotationOptions: js.UndefOr[js.Array[Annotation]]): js.Function1[/* params */ Params[PickOptionsannotations], Params[PickOptionsannotations]] = ^.asInstanceOf[js.Dynamic].applyDynamic("annotation")(annotationOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ Params[PickOptionsannotations], Params[PickOptionsannotations]]]
  @JSImport("@antv/g2plot", "adaptors.annotation")
  @js.native
  def annotation_Fadaptors: js.Function1[
    /* annotationOptions */ js.UndefOr[js.Array[Annotation]], 
    js.Function1[/* params */ Params[PickOptionsannotations], Params[PickOptionsannotations]]
  ] = js.native
  
  inline def annotation_Fadaptors_=(
    x: js.Function1[
      /* annotationOptions */ js.UndefOr[js.Array[Annotation]], 
      js.Function1[/* params */ Params[PickOptionsannotations], Params[PickOptionsannotations]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("annotation")(x.asInstanceOf[js.Any])
  
  @JSImport("@antv/g2plot", "adaptors.interaction")
  @js.native
  def interaction: Fn0 = js.native
  inline def interaction[O /* <: PickOptionsinteractions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("interaction")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  inline def interaction_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interaction")(x.asInstanceOf[js.Any])
  
  @JSImport("@antv/g2plot", "adaptors.legend")
  @js.native
  def legend: FnCall = js.native
  inline def legend[O /* <: PickOptionslegendcolorFie */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("legend")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  inline def legend_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("legend")(x.asInstanceOf[js.Any])
  
  @JSImport("@antv/g2plot", "adaptors.scale")
  @js.native
  def scale: js.Function2[
    /* axes */ Record[String, Axis], 
    /* meta */ js.UndefOr[Record[String, Meta]], 
    js.Function1[/* params */ Params[PickOptionsmeta], Params[PickOptionsmeta]]
  ] = js.native
  inline def scale(axes: Record[String, Axis]): js.Function1[/* params */ Params[PickOptionsmeta], Params[PickOptionsmeta]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scale")(axes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ Params[PickOptionsmeta], Params[PickOptionsmeta]]]
  inline def scale(axes: Record[String, Axis], meta: js.UndefOr[Record[String, Meta]]): js.Function1[/* params */ Params[PickOptionsmeta], Params[PickOptionsmeta]] = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(axes.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ Params[PickOptionsmeta], Params[PickOptionsmeta]]]
  inline def scale_=(
    x: js.Function2[
      /* axes */ Record[String, Axis], 
      /* meta */ js.UndefOr[Record[String, Meta]], 
      js.Function1[/* params */ Params[PickOptionsmeta], Params[PickOptionsmeta]]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scale")(x.asInstanceOf[js.Any])
  
  @JSImport("@antv/g2plot", "adaptors.theme")
  @js.native
  def theme: Fn1 = js.native
  inline def theme[O /* <: PickOptionstheme */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("theme")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  inline def theme_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
  
  @JSImport("@antv/g2plot", "adaptors.tooltip")
  @js.native
  def tooltip: FnCallParams = js.native
  inline def tooltip[O /* <: PickOptionstooltip */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  inline def tooltip_=(x: FnCallParams): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
}
