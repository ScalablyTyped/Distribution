package typings.antdMobile

import typings.antdMobile.anon.PartialStepsProps
import typings.antdMobile.anon.WeakValidationMapStepsPro
import typings.antdMobile.stepMod.StepProps
import typings.antdMobile.stepsStepsMod.StepsProps
import typings.react.mod.FC
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepsMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/steps/steps.StepsProps> & {  Step :react.react.FC<antd-mobile.antd-mobile/es/components/steps/step.StepProps>} */
  object default {
    
    inline def apply(props: StepsProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: StepsProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/steps", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/steps", "default.Step")
    @js.native
    def Step: FC[StepProps] = js.native
    inline def Step_=(x: FC[StepProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Step")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/steps", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/steps", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialStepsProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialStepsProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/steps", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/steps", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapStepsPro] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapStepsPro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
