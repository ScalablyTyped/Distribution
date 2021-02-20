package typings.androiduix.global.android.text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object style {
  
  @JSGlobal("android.text.style.CharacterStyle")
  @js.native
  abstract class CharacterStyle ()
    extends typings.androiduix.android.text.style.CharacterStyle
  object CharacterStyle {
    
    @JSGlobal("android.text.style.CharacterStyle.Passthrough_CharacterStyle")
    @js.native
    class PassthroughCharacterStyle protected ()
      extends typings.androiduix.android.text.style.CharacterStyle.PassthroughCharacterStyle {
      def this(cs: typings.androiduix.android.text.style.CharacterStyle) = this()
    }
    
    /* static member */
    @JSGlobal("android.text.style.CharacterStyle.wrap")
    @js.native
    def wrap(cs: typings.androiduix.android.text.style.CharacterStyle): typings.androiduix.android.text.style.CharacterStyle = js.native
    
    /* static member */
    @JSGlobal("android.text.style.CharacterStyle.type")
    @js.native
    val `type`: js.Symbol = js.native
  }
  
  object LeadingMarginSpan {
    
    object LeadingMarginSpan2 {
      
      @JSGlobal("android.text.style.LeadingMarginSpan.LeadingMarginSpan2.isImpl")
      @js.native
      def isImpl(obj: js.Any): Boolean = js.native
    }
    
    @JSGlobal("android.text.style.LeadingMarginSpan.Standard")
    @js.native
    class Standard protected ()
      extends typings.androiduix.android.text.style.LeadingMarginSpan.Standard {
      def this(first: Double) = this()
      def this(first: Double, rest: Double) = this()
    }
    
    @JSGlobal("android.text.style.LeadingMarginSpan.isImpl")
    @js.native
    def isImpl(obj: js.Any): Boolean = js.native
    
    @JSGlobal("android.text.style.LeadingMarginSpan.type")
    @js.native
    val `type`: js.Symbol = js.native
  }
  
  object LineBackgroundSpan {
    
    @JSGlobal("android.text.style.LineBackgroundSpan.type")
    @js.native
    val `type`: js.Symbol = js.native
  }
  
  object LineHeightSpan {
    
    @JSGlobal("android.text.style.LineHeightSpan.type")
    @js.native
    val `type`: js.Symbol = js.native
  }
  
  @JSGlobal("android.text.style.MetricAffectingSpan")
  @js.native
  abstract class MetricAffectingSpan ()
    extends typings.androiduix.android.text.style.MetricAffectingSpan
  object MetricAffectingSpan {
    
    @JSGlobal("android.text.style.MetricAffectingSpan.Passthrough_MetricAffectingSpan")
    @js.native
    class PassthroughMetricAffectingSpan protected ()
      extends typings.androiduix.android.text.style.MetricAffectingSpan.PassthroughMetricAffectingSpan {
      def this(cs: typings.androiduix.android.text.style.MetricAffectingSpan) = this()
    }
    
    /* static member */
    @JSGlobal("android.text.style.MetricAffectingSpan.type")
    @js.native
    val `type`: js.Symbol = js.native
  }
  
  object ParagraphStyle {
    
    @JSGlobal("android.text.style.ParagraphStyle.type")
    @js.native
    val `type`: js.Symbol = js.native
  }
  
  @JSGlobal("android.text.style.ReplacementSpan")
  @js.native
  abstract class ReplacementSpan ()
    extends typings.androiduix.android.text.style.ReplacementSpan
  object ReplacementSpan {
    
    /* static member */
    @JSGlobal("android.text.style.ReplacementSpan.type")
    @js.native
    val `type`: js.Symbol = js.native
  }
  
  object TabStopSpan {
    
    @JSGlobal("android.text.style.TabStopSpan.Standard")
    @js.native
    class Standard protected ()
      extends typings.androiduix.android.text.style.TabStopSpan.Standard {
      def this(where: Double) = this()
    }
    
    @JSGlobal("android.text.style.TabStopSpan.isImpl")
    @js.native
    def isImpl(obj: js.Any): Boolean = js.native
    
    @JSGlobal("android.text.style.TabStopSpan.type")
    @js.native
    val `type`: js.Symbol = js.native
  }
}
