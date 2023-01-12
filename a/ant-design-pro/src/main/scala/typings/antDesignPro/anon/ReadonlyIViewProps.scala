package typings.antDesignPro.anon

import org.scalablytyped.runtime.StringDictionary
import typings.antvG2.libInterfaceMod.Datum
import typings.antvG2.libInterfaceMod.ScaleOption
import typings.antvG2.libInterfaceMod.ViewPadding
import typings.bizcharts.anon.End
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts/lib/interface.IViewProps> */
trait ReadonlyIViewProps extends StObject {
  
  val data: js.UndefOr[js.Array[Any]] = js.undefined
  
  val filter: js.UndefOr[
    (js.Array[
      js.Tuple2[String, Null | (js.Function2[/* value */ Any, /* datum */ Datum, Boolean])]
    ]) | (Record[String, js.Function2[/* value */ Any, /* datum */ Datum, Boolean]])
  ] = js.undefined
  
  val padding: js.UndefOr[ViewPadding] = js.undefined
  
  val region: js.UndefOr[End] = js.undefined
  
  val scale: js.UndefOr[StringDictionary[ScaleOption]] = js.undefined
}
object ReadonlyIViewProps {
  
  inline def apply(): ReadonlyIViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyIViewProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyIViewProps] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setFilter(
      value: (js.Array[
          js.Tuple2[String, Null | (js.Function2[/* value */ Any, /* datum */ Datum, Boolean])]
        ]) | (Record[String, js.Function2[/* value */ Any, /* datum */ Datum, Boolean]])
    ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: (js.Tuple2[String, Null | (js.Function2[/* value */ Any, /* datum */ Datum, Boolean])])*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setPadding(value: ViewPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setRegion(value: End): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setScale(value: StringDictionary[ScaleOption]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
