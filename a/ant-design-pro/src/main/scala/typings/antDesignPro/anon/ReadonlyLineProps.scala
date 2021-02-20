package typings.antDesignPro.anon

import typings.antvG2.mod.Styles.line
import typings.bizcharts.anon.AutoRotate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.Guide.LineProps> */
@js.native
trait ReadonlyLineProps extends StObject {
  
  val end: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.native
  
  val lineStyle: js.UndefOr[line] = js.native
  
  val start: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.native
  
  val text: js.UndefOr[AutoRotate] = js.native
  
  val top: js.UndefOr[Boolean] = js.native
}
object ReadonlyLineProps {
  
  @scala.inline
  def apply(): ReadonlyLineProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyLineProps]
  }
  
  @scala.inline
  implicit class ReadonlyLinePropsMutableBuilder[Self <: ReadonlyLineProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "end", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setEndVarargs(value: js.Any*): Self = StObject.set(x, "end", js.Array(value :_*))
    
    @scala.inline
    def setLineStyle(value: line): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    @scala.inline
    def setStart(
      value: js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
    ): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFunction2(value: (/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStartVarargs(value: js.Any*): Self = StObject.set(x, "start", js.Array(value :_*))
    
    @scala.inline
    def setText(value: AutoRotate): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
