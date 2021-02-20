package typings.antDesignPro.anon

import typings.bizcharts.mod.AlignXType
import typings.bizcharts.mod.AlignYType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.Guide.HtmlProps> */
@js.native
trait ReadonlyHtmlProps extends StObject {
  
  val alignX: js.UndefOr[AlignXType] = js.native
  
  val alignY: js.UndefOr[AlignYType] = js.native
  
  val html: js.UndefOr[String] = js.native
  
  val offsetX: js.UndefOr[Double] = js.native
  
  val offsetY: js.UndefOr[Double] = js.native
  
  val position: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.native
  
  val zIndex: js.UndefOr[Double] = js.native
}
object ReadonlyHtmlProps {
  
  @scala.inline
  def apply(): ReadonlyHtmlProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyHtmlProps]
  }
  
  @scala.inline
  implicit class ReadonlyHtmlPropsMutableBuilder[Self <: ReadonlyHtmlProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignX(value: AlignXType): Self = StObject.set(x, "alignX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignXUndefined: Self = StObject.set(x, "alignX", js.undefined)
    
    @scala.inline
    def setAlignY(value: AlignYType): Self = StObject.set(x, "alignY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignYUndefined: Self = StObject.set(x, "alignY", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setPosition(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPositionVarargs(value: js.Any*): Self = StObject.set(x, "position", js.Array(value :_*))
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
