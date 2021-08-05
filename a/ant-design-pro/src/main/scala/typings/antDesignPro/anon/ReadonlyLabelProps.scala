package typings.antDesignPro.anon

import typings.antvG2.mod.Styles.line
import typings.antvG2.mod.Styles.text
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.LabelProps> */
trait ReadonlyLabelProps extends StObject {
  
  val autoRotate: js.UndefOr[Boolean] = js.undefined
  
  val children: js.UndefOr[ReactNode] = js.undefined
  
  val content: js.UndefOr[
    String | (js.Tuple2[
      String, 
      js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], String]
    ])
  ] = js.undefined
  
  val formatter: js.UndefOr[
    (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | Double
  ] = js.undefined
  
  val htmlTemplate: js.UndefOr[
    (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | String
  ] = js.undefined
  
  val key: js.UndefOr[typings.react.mod.Key] = js.undefined
  
  val labelEmit: js.UndefOr[Boolean] = js.undefined
  
  val labelLine: js.UndefOr[
    (js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], line]) | line | Boolean
  ] = js.undefined
  
  val offset: js.UndefOr[Double] = js.undefined
  
  val ref: js.UndefOr[LegacyRef[js.Any]] = js.undefined
  
  val textStyle: js.UndefOr[text | (js.Function1[/* t */ js.UndefOr[js.Any], text])] = js.undefined
}
object ReadonlyLabelProps {
  
  inline def apply(): ReadonlyLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyLabelProps]
  }
  
  extension [Self <: ReadonlyLabelProps](x: Self) {
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setContent(
      value: String | (js.Tuple2[
          String, 
          js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], String]
        ])
    ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFormatter(
      value: (js.Function3[
          /* text */ js.UndefOr[js.Any], 
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          String
        ]) | Double
    ): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterFunction3(
      value: (/* text */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setHtmlTemplate(
      value: (js.Function3[
          /* text */ js.UndefOr[js.Any], 
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          String
        ]) | String
    ): Self = StObject.set(x, "htmlTemplate", value.asInstanceOf[js.Any])
    
    inline def setHtmlTemplateFunction3(
      value: (/* text */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "htmlTemplate", js.Any.fromFunction3(value))
    
    inline def setHtmlTemplateUndefined: Self = StObject.set(x, "htmlTemplate", js.undefined)
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLabelEmit(value: Boolean): Self = StObject.set(x, "labelEmit", value.asInstanceOf[js.Any])
    
    inline def setLabelEmitUndefined: Self = StObject.set(x, "labelEmit", js.undefined)
    
    inline def setLabelLine(
      value: (js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], line]) | line | Boolean
    ): Self = StObject.set(x, "labelLine", value.asInstanceOf[js.Any])
    
    inline def setLabelLineFunction2(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => line): Self = StObject.set(x, "labelLine", js.Any.fromFunction2(value))
    
    inline def setLabelLineUndefined: Self = StObject.set(x, "labelLine", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRef(value: LegacyRef[js.Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setTextStyle(value: text | (js.Function1[/* t */ js.UndefOr[js.Any], text])): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleFunction1(value: /* t */ js.UndefOr[js.Any] => text): Self = StObject.set(x, "textStyle", js.Any.fromFunction1(value))
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
