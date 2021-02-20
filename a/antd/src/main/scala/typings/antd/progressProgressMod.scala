package typings.antd

import org.scalablytyped.runtime.StringDictionary
import typings.antd.anon.Direction
import typings.antd.anon.GapDegree
import typings.antd.antdStrings.active
import typings.antd.antdStrings.bottom
import typings.antd.antdStrings.butt
import typings.antd.antdStrings.exception
import typings.antd.antdStrings.left
import typings.antd.antdStrings.normal
import typings.antd.antdStrings.right
import typings.antd.antdStrings.round
import typings.antd.antdStrings.square
import typings.antd.antdStrings.success
import typings.antd.antdStrings.top
import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressProgressMod {
  
  @JSImport("antd/lib/progress/progress", JSImport.Default)
  @js.native
  class default () extends Progress
  /* static members */
  object default {
    
    @JSImport("antd/lib/progress/progress", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/progress/progress", "default.defaultProps")
    @js.native
    def defaultProps: GapDegree = js.native
    @scala.inline
    def defaultProps_=(x: GapDegree): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FromToGradients extends StObject {
    
    var from: String = js.native
    
    var to: String = js.native
  }
  object FromToGradients {
    
    @scala.inline
    def apply(from: String, to: String): FromToGradients = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[FromToGradients]
    }
    
    @scala.inline
    implicit class FromToGradientsMutableBuilder[Self <: FromToGradients] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Progress
    extends Component[ProgressProps, js.Object, js.Any] {
    
    def getPercentNumber(): Double = js.native
    
    def getProgressStatus(): success | normal | active | exception = js.native
    
    @JSName("renderProcessInfo")
    def renderProcessInfo_active(prefixCls: String, progressStatus: active): Element | Null = js.native
    @JSName("renderProcessInfo")
    def renderProcessInfo_exception(prefixCls: String, progressStatus: exception): Element | Null = js.native
    @JSName("renderProcessInfo")
    def renderProcessInfo_normal(prefixCls: String, progressStatus: normal): Element | Null = js.native
    @JSName("renderProcessInfo")
    def renderProcessInfo_success(prefixCls: String, progressStatus: success): Element | Null = js.native
    
    def renderProgress(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  }
  
  type ProgressGradient = Direction with (StringGradients | FromToGradients)
  
  @js.native
  trait ProgressProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[
        js.Function2[/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double], ReactNode]
      ] = js.native
    
    var gapDegree: js.UndefOr[Double] = js.native
    
    var gapPosition: js.UndefOr[top | bottom | left | right] = js.native
    
    var percent: js.UndefOr[Double] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var showInfo: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[ProgressSize] = js.native
    
    var status: js.UndefOr[normal | exception | active | success] = js.native
    
    var steps: js.UndefOr[Double] = js.native
    
    var strokeColor: js.UndefOr[String | ProgressGradient] = js.native
    
    var strokeLinecap: js.UndefOr[butt | square | round] = js.native
    
    var strokeWidth: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var success: js.UndefOr[SuccessProps] = js.native
    
    /** @deprecated Use `success` instead */
    var successPercent: js.UndefOr[Double] = js.native
    
    var trailColor: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[ProgressType] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object ProgressProps {
    
    @scala.inline
    def apply(): ProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProgressProps]
    }
    
    @scala.inline
    implicit class ProgressPropsMutableBuilder[Self <: ProgressProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFormat(value: (/* percent */ js.UndefOr[Double], /* successPercent */ js.UndefOr[Double]) => ReactNode): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGapDegree(value: Double): Self = StObject.set(x, "gapDegree", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapDegreeUndefined: Self = StObject.set(x, "gapDegree", js.undefined)
      
      @scala.inline
      def setGapPosition(value: top | bottom | left | right): Self = StObject.set(x, "gapPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapPositionUndefined: Self = StObject.set(x, "gapPosition", js.undefined)
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setShowInfo(value: Boolean): Self = StObject.set(x, "showInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInfoUndefined: Self = StObject.set(x, "showInfo", js.undefined)
      
      @scala.inline
      def setSize(value: ProgressSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: normal | exception | active | success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      @scala.inline
      def setStrokeColor(value: String | ProgressGradient): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      @scala.inline
      def setStrokeLinecap(value: butt | square | round): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuccess(value: SuccessProps): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessPercent(value: Double): Self = StObject.set(x, "successPercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessPercentUndefined: Self = StObject.set(x, "successPercent", js.undefined)
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setTrailColor(value: String): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailColorUndefined: Self = StObject.set(x, "trailColor", js.undefined)
      
      @scala.inline
      def setType(value: ProgressType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.default
    - typings.antd.antdStrings.small
  */
  trait ProgressSize extends StObject
  object ProgressSize {
    
    @scala.inline
    def default: typings.antd.antdStrings.default = "default".asInstanceOf[typings.antd.antdStrings.default]
    
    @scala.inline
    def small: typings.antd.antdStrings.small = "small".asInstanceOf[typings.antd.antdStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.line
    - typings.antd.antdStrings.circle
    - typings.antd.antdStrings.dashboard
  */
  trait ProgressType extends StObject
  
  type StringGradients = StringDictionary[String]
  
  @js.native
  trait SuccessProps extends StObject {
    
    var percent: js.UndefOr[Double] = js.native
    
    /** @deprecated Use `percent` instead */
    var progress: js.UndefOr[Double] = js.native
    
    var strokeColor: js.UndefOr[String] = js.native
  }
  object SuccessProps {
    
    @scala.inline
    def apply(): SuccessProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuccessProps]
    }
    
    @scala.inline
    implicit class SuccessPropsMutableBuilder[Self <: SuccessProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    }
  }
}
