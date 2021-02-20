package typings.antDesignPro.anon

import typings.antvG2.mod.Styles.line
import typings.antvG2.mod.Styles.text
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<bizcharts.bizcharts.LabelProps> */
@js.native
trait ReadonlyLabelProps extends StObject {
  
  val autoRotate: js.UndefOr[Boolean] = js.native
  
  val children: js.UndefOr[ReactNode] = js.native
  
  val content: js.UndefOr[
    String | (js.Tuple2[String, js.Function2[/* x */ js.UndefOr[_], /* y */ js.UndefOr[_], String]])
  ] = js.native
  
  val formatter: js.UndefOr[
    (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | Double
  ] = js.native
  
  val htmlTemplate: js.UndefOr[
    (js.Function3[
      /* text */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* index */ js.UndefOr[Double], 
      String
    ]) | String
  ] = js.native
  
  val key: js.UndefOr[typings.react.mod.Key] = js.native
  
  val labelEmit: js.UndefOr[Boolean] = js.native
  
  val labelLine: js.UndefOr[
    (js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], line]) | line | Boolean
  ] = js.native
  
  val offset: js.UndefOr[Double] = js.native
  
  val ref: js.UndefOr[LegacyRef[_]] = js.native
  
  val textStyle: js.UndefOr[text | (js.Function1[/* t */ js.UndefOr[js.Any], text])] = js.native
}
object ReadonlyLabelProps {
  
  @scala.inline
  def apply(): ReadonlyLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyLabelProps]
  }
  
  @scala.inline
  implicit class ReadonlyLabelPropsMutableBuilder[Self <: ReadonlyLabelProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setContent(
      value: String | (js.Tuple2[String, js.Function2[/* x */ js.UndefOr[_], /* y */ js.UndefOr[_], String]])
    ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setFormatter(
      value: (js.Function3[
          /* text */ js.UndefOr[js.Any], 
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          String
        ]) | Double
    ): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterFunction3(
      value: (/* text */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setHtmlTemplate(
      value: (js.Function3[
          /* text */ js.UndefOr[js.Any], 
          /* item */ js.UndefOr[js.Any], 
          /* index */ js.UndefOr[Double], 
          String
        ]) | String
    ): Self = StObject.set(x, "htmlTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlTemplateFunction3(
      value: (/* text */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "htmlTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHtmlTemplateUndefined: Self = StObject.set(x, "htmlTemplate", js.undefined)
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLabelEmit(value: Boolean): Self = StObject.set(x, "labelEmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelEmitUndefined: Self = StObject.set(x, "labelEmit", js.undefined)
    
    @scala.inline
    def setLabelLine(
      value: (js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], line]) | line | Boolean
    ): Self = StObject.set(x, "labelLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLineFunction2(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => line): Self = StObject.set(x, "labelLine", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLabelLineUndefined: Self = StObject.set(x, "labelLine", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setRef(value: LegacyRef[_]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setTextStyle(value: text | (js.Function1[/* t */ js.UndefOr[js.Any], text])): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleFunction1(value: /* t */ js.UndefOr[js.Any] => text): Self = StObject.set(x, "textStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
