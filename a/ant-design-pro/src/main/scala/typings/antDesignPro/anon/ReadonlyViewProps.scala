package typings.antDesignPro.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.ViewProps> */
@js.native
trait ReadonlyViewProps extends StObject {
  
  val animate: js.UndefOr[Boolean] = js.native
  
  val children: js.UndefOr[ReactNode] = js.native
  
  val data: js.UndefOr[js.Any] = js.native
  
  val end: js.UndefOr[typings.bizcharts.anon.X] = js.native
  
  val filter: js.UndefOr[js.Array[_]] = js.native
  
  val id: js.UndefOr[String] = js.native
  
  val key: js.UndefOr[typings.react.mod.Key] = js.native
  
  val ref: js.UndefOr[LegacyRef[_]] = js.native
  
  val scale: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  val start: js.UndefOr[typings.bizcharts.anon.X] = js.native
}
object ReadonlyViewProps {
  
  @scala.inline
  def apply(): ReadonlyViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyViewProps]
  }
  
  @scala.inline
  implicit class ReadonlyViewPropsMutableBuilder[Self <: ReadonlyViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEnd(value: typings.bizcharts.anon.X): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Array[_]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: js.Any*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRef(value: LegacyRef[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setScale(value: StringDictionary[js.Any]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setStart(value: typings.bizcharts.anon.X): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
