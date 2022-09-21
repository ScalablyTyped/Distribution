package typings.antdMobile

import typings.antdMobile.anon.Children
import typings.antdMobile.anon.FnCall
import typings.antdMobile.anon.FnCallDependenciesForm
import typings.antdMobile.anon.PartialclassNamestringund
import typings.antdMobile.anon.WeakValidationMapclassNam
import typings.antdMobile.anon.classNamestringundefinedsAriaactivedescendant
import typings.antdMobile.formArrayMod.FormArrayProps
import typings.antdMobile.formItemMod.FormItemProps
import typings.antdMobile.formSubscribeMod.FormSubscribeProps
import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<{  className :string | undefined,   style :react.react.CSSProperties & std.Partial<std.Record<'--border-bottom' | '--border-inner' | '--border-top' | '--prefix-width', string>> | undefined,   tabIndex :number | undefined,   footer :react.react.ReactNode | undefined,   mode :'default' | 'card' | undefined} & std.Pick<rc-field-form.rc-field-form.FormProps<any>, 'children' | 'form' | 'name' | 'initialValues' | 'preserve' | 'validateMessages' | 'validateTrigger' | 'onFieldsChange' | 'onFinish' | 'onFinishFailed' | 'onValuesChange'> & react.react.AriaAttributes & std.Partial<antd-mobile.antd-mobile/es/components/form/context.FormContextType> & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/form/form.FormInstance>> & {  Item :react.react.FC<antd-mobile.antd-mobile/es/components/form/form-item.FormItemProps>,   Subscribe :react.react.FC<antd-mobile.antd-mobile/es/components/form/form-subscribe.FormSubscribeProps>,   Header :react.react.FC<{  children :react.react.ReactNode | undefined}>,   Array :react.react.FC<antd-mobile.antd-mobile/es/components/form/form-array.FormArrayProps>,   useForm :{None <Values = any>(form : rc-field-form.rc-field-form/es/interface.FormInstance<Values>): [rc-field-form.rc-field-form/es/interface.FormInstance<Values>], None <Values = any>(): [rc-field-form.rc-field-form/es/interface.FormInstance<Values>]},   useWatch :{None <ValueType = rc-field-form.rc-field-form/es/interface.Store>(dependencies : rc-field-form.rc-field-form/es/interface.NamePath, form : rc-field-form.rc-field-form/es/interface.FormInstance<any>): ValueType, None <ValueType = rc-field-form.rc-field-form/es/interface.Store>(dependencies : rc-field-form.rc-field-form/es/interface.NamePath): ValueType, None <TForm extends rc-field-form.rc-field-form/es/interface.FormInstance<any>>(dependencies : rc-field-form.rc-field-form/es/interface.NamePath, form : TForm): any, None <TForm extends rc-field-form.rc-field-form/es/interface.FormInstance<any>>(dependencies : rc-field-form.rc-field-form/es/interface.NamePath): any, None <TForm extends rc-field-form.rc-field-form/es/interface.FormInstance<any>>(dependencies : [], form : TForm): rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>, None <TForm extends rc-field-form.rc-field-form/es/interface.FormInstance<any>>(dependencies : []): rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>, None <TDependencies extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>, TForm extends rc-field-form.rc-field-form/es/interface.FormInstance<any>>(dependencies : [TDependencies], form : TForm): rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies], None <TDependencies extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>, TForm extends rc-field-form.rc-field-form/es/interface.FormInstance<any>>(dependencies : TDependencies, form : TForm): rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies], None <TDependencies extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>, TForm extends rc-field-form.rc-field-form/es/interface.FormInstance<any>>(dependencies : [TDependencies]): rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies], None <TDependencies extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>, TForm extends rc-field-form.rc-field-form/es/interface.FormInstance<any>>(dependencies : TDependencies): rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies], None <TDependencies1 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>, TForm extends rc-field-form.rc-field-form/es/interface.FormInstance<any>, TDependencies2 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1]>(dependencies : [TDependencies1, TDependencies2], form : TForm): rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2], None <TDependencies1 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>, TForm extends rc-field-form.rc-field-form/es/interface.FormInstance<any>, TDependencies2 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1]>(dependencies : [TDependencies1, TDependencies2]): rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2], None <TDependencies1 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>, TForm extends rc-field-form.rc-field-form/es/interface.FormInstance<any>, TDependencies2 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1], TDependencies3 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2]>(dependencies : [TDependencies1, TDependencies2, TDependencies3], form : TForm): rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3], None <TDependencies1 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>, TForm extends rc-field-form.rc-field-form/es/interface.FormInstance<any>, TDependencies2 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1], TDependencies3 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2]>(dependencies : [TDependencies1, TDependencies2, TDependencies3]): rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3], None <TDependencies1 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>, TForm extends rc-field-form.rc-field-form/es/interface.FormInstance<any>, TDependencies2 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1], TDependencies3 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2], TDependencies4 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3]>(dependencies : [TDependencies1, TDependencies2, TDependencies3, TDependencies4], form : TForm): rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4], None <TDependencies1 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>, TForm extends rc-field-form.rc-field-form/es/interface.FormInstance<any>, TDependencies2 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1], TDependencies3 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2], TDependencies4 extends keyof rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3]>(dependencies : [TDependencies1, TDependencies2, TDependencies3, TDependencies4]): rc-field-form.rc-field-form/es/useWatch.GetGeneric<TForm>[TDependencies1][TDependencies2][TDependencies3][TDependencies4]}} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: classNamestringundefinedsAriaactivedescendant): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("antd-mobile/es/components/form", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/form", "default.Array")
    @js.native
    def Array: FC[FormArrayProps] = js.native
    inline def Array_=(x: FC[FormArrayProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Array")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/form", "default.Header")
    @js.native
    def Header: FC[Children] = js.native
    inline def Header_=(x: FC[Children]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/form", "default.Item")
    @js.native
    def Item: FC[FormItemProps] = js.native
    inline def Item_=(x: FC[FormItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/form", "default.Subscribe")
    @js.native
    def Subscribe: FC[FormSubscribeProps] = js.native
    inline def Subscribe_=(x: FC[FormSubscribeProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Subscribe")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/form", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialclassNamestringund] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialclassNamestringund]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/form", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/form", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapclassNam] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapclassNam]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/form", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
    
    @JSImport("antd-mobile/es/components/form", "default.useForm")
    @js.native
    def useForm: FnCall = js.native
    inline def useForm_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useForm")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/form", "default.useWatch")
    @js.native
    def useWatch: FnCallDependenciesForm = js.native
    inline def useWatch_=(x: FnCallDependenciesForm): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useWatch")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antdMobile.antdMobileStrings.vertical
    - typings.antdMobile.antdMobileStrings.horizontal
  */
  trait FormLayout extends StObject
  object FormLayout {
    
    inline def horizontal: typings.antdMobile.antdMobileStrings.horizontal = "horizontal".asInstanceOf[typings.antdMobile.antdMobileStrings.horizontal]
    
    inline def vertical: typings.antdMobile.antdMobileStrings.vertical = "vertical".asInstanceOf[typings.antdMobile.antdMobileStrings.vertical]
  }
}
