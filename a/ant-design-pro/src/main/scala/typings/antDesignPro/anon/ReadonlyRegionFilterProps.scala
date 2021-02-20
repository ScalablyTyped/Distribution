package typings.antDesignPro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.Guide.RegionFilterProps> */
@js.native
trait ReadonlyRegionFilterProps extends StObject {
  
  @JSName("apply")
  val apply: js.UndefOr[js.Array[_]] = js.native
  
  val color: js.UndefOr[String] = js.native
  
  val end: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.native
  
  val start: js.UndefOr[
    js.Object | js.Array[_] | (js.Function2[/* xScale */ js.UndefOr[js.Any], /* yScale */ js.UndefOr[js.Any], _])
  ] = js.native
  
  val top: js.UndefOr[Boolean] = js.native
}
object ReadonlyRegionFilterProps {
  
  @scala.inline
  def apply(): ReadonlyRegionFilterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyRegionFilterProps]
  }
  
  @scala.inline
  implicit class ReadonlyRegionFilterPropsMutableBuilder[Self <: ReadonlyRegionFilterProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApply(value: js.Array[_]): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    @scala.inline
    def setApplyVarargs(value: js.Any*): Self = StObject.set(x, "apply", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
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
    def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
