package typings.antd

import typings.antd.formFormMod.RequiredMark
import typings.antd.formItemMod.ValidateStatus
import typings.antd.gridColMod.ColProps
import typings.antd.interfaceMod.FormLabelAlign
import typings.rcFieldForm.formContextMod.FormChangeInfo
import typings.rcFieldForm.formContextMod.FormFinishInfo
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formContextMod {
  
  @JSImport("antd/lib/form/context", "FormContext")
  @js.native
  val FormContext: Context[FormContextProps] = js.native
  
  @JSImport("antd/lib/form/context", "FormItemContext")
  @js.native
  val FormItemContext: Context[FormItemContextProps] = js.native
  
  @JSImport("antd/lib/form/context", "FormItemPrefixContext")
  @js.native
  val FormItemPrefixContext: Context[FormItemPrefixContextProps] = js.native
  
  @JSImport("antd/lib/form/context", "FormProvider")
  @js.native
  val FormProvider: FC[FormProviderProps] = js.native
  
  @js.native
  trait FormContextProps extends StObject {
    
    var colon: js.UndefOr[Boolean] = js.native
    
    def itemRef(name: js.Array[String | Double]): js.Function1[/* node */ ReactElement, Unit] = js.native
    
    var labelAlign: js.UndefOr[FormLabelAlign] = js.native
    
    var labelCol: js.UndefOr[ColProps] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var requiredMark: js.UndefOr[RequiredMark] = js.native
    
    var vertical: Boolean = js.native
    
    var wrapperCol: js.UndefOr[ColProps] = js.native
  }
  object FormContextProps {
    
    @scala.inline
    def apply(
      itemRef: js.Array[String | Double] => js.Function1[/* node */ ReactElement, Unit],
      vertical: Boolean
    ): FormContextProps = {
      val __obj = js.Dynamic.literal(itemRef = js.Any.fromFunction1(itemRef), vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormContextProps]
    }
    
    @scala.inline
    implicit class FormContextPropsMutableBuilder[Self <: FormContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
      
      @scala.inline
      def setItemRef(value: js.Array[String | Double] => js.Function1[/* node */ ReactElement, Unit]): Self = StObject.set(x, "itemRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLabelAlign(value: FormLabelAlign): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      @scala.inline
      def setLabelCol(value: ColProps): Self = StObject.set(x, "labelCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelColUndefined: Self = StObject.set(x, "labelCol", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRequiredMark(value: RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperCol(value: ColProps): Self = StObject.set(x, "wrapperCol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperColUndefined: Self = StObject.set(x, "wrapperCol", js.undefined)
    }
  }
  
  @js.native
  trait FormItemContextProps extends StObject {
    
    def updateItemErrors(name: String, errors: js.Array[String]): Unit = js.native
  }
  object FormItemContextProps {
    
    @scala.inline
    def apply(updateItemErrors: (String, js.Array[String]) => Unit): FormItemContextProps = {
      val __obj = js.Dynamic.literal(updateItemErrors = js.Any.fromFunction2(updateItemErrors))
      __obj.asInstanceOf[FormItemContextProps]
    }
    
    @scala.inline
    implicit class FormItemContextPropsMutableBuilder[Self <: FormItemContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpdateItemErrors(value: (String, js.Array[String]) => Unit): Self = StObject.set(x, "updateItemErrors", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait FormItemPrefixContextProps extends StObject {
    
    var prefixCls: String = js.native
    
    var status: js.UndefOr[ValidateStatus] = js.native
  }
  object FormItemPrefixContextProps {
    
    @scala.inline
    def apply(prefixCls: String): FormItemPrefixContextProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormItemPrefixContextProps]
    }
    
    @scala.inline
    implicit class FormItemPrefixContextPropsMutableBuilder[Self <: FormItemPrefixContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: ValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<rc-field-form.rc-field-form/es/FormContext.FormProviderProps, 'validateMessages'> */
  @js.native
  trait FormProviderProps extends StObject {
    
    var onFormChange: js.UndefOr[js.Function2[/* name */ String, /* info */ FormChangeInfo, Unit]] = js.native
    
    var onFormFinish: js.UndefOr[js.Function2[/* name */ String, /* info */ FormFinishInfo, Unit]] = js.native
  }
  object FormProviderProps {
    
    @scala.inline
    def apply(): FormProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProviderProps]
    }
    
    @scala.inline
    implicit class FormProviderPropsMutableBuilder[Self <: FormProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnFormChange(value: (/* name */ String, /* info */ FormChangeInfo) => Unit): Self = StObject.set(x, "onFormChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFormChangeUndefined: Self = StObject.set(x, "onFormChange", js.undefined)
      
      @scala.inline
      def setOnFormFinish(value: (/* name */ String, /* info */ FormFinishInfo) => Unit): Self = StObject.set(x, "onFormFinish", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFormFinishUndefined: Self = StObject.set(x, "onFormFinish", js.undefined)
    }
  }
}
