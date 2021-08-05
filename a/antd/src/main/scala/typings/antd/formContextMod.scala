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
  
  trait FormContextProps extends StObject {
    
    var colon: js.UndefOr[Boolean] = js.undefined
    
    def itemRef(name: js.Array[String | Double]): js.Function1[/* node */ ReactElement, Unit]
    
    var labelAlign: js.UndefOr[FormLabelAlign] = js.undefined
    
    var labelCol: js.UndefOr[ColProps] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var requiredMark: js.UndefOr[RequiredMark] = js.undefined
    
    var vertical: Boolean
    
    var wrapperCol: js.UndefOr[ColProps] = js.undefined
  }
  object FormContextProps {
    
    inline def apply(
      itemRef: js.Array[String | Double] => js.Function1[/* node */ ReactElement, Unit],
      vertical: Boolean
    ): FormContextProps = {
      val __obj = js.Dynamic.literal(itemRef = js.Any.fromFunction1(itemRef), vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormContextProps]
    }
    
    extension [Self <: FormContextProps](x: Self) {
      
      inline def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
      
      inline def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
      
      inline def setItemRef(value: js.Array[String | Double] => js.Function1[/* node */ ReactElement, Unit]): Self = StObject.set(x, "itemRef", js.Any.fromFunction1(value))
      
      inline def setLabelAlign(value: FormLabelAlign): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
      
      inline def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
      
      inline def setLabelCol(value: ColProps): Self = StObject.set(x, "labelCol", value.asInstanceOf[js.Any])
      
      inline def setLabelColUndefined: Self = StObject.set(x, "labelCol", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRequiredMark(value: RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
      
      inline def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setWrapperCol(value: ColProps): Self = StObject.set(x, "wrapperCol", value.asInstanceOf[js.Any])
      
      inline def setWrapperColUndefined: Self = StObject.set(x, "wrapperCol", js.undefined)
    }
  }
  
  trait FormItemContextProps extends StObject {
    
    def updateItemErrors(name: String, errors: js.Array[String]): Unit
  }
  object FormItemContextProps {
    
    inline def apply(updateItemErrors: (String, js.Array[String]) => Unit): FormItemContextProps = {
      val __obj = js.Dynamic.literal(updateItemErrors = js.Any.fromFunction2(updateItemErrors))
      __obj.asInstanceOf[FormItemContextProps]
    }
    
    extension [Self <: FormItemContextProps](x: Self) {
      
      inline def setUpdateItemErrors(value: (String, js.Array[String]) => Unit): Self = StObject.set(x, "updateItemErrors", js.Any.fromFunction2(value))
    }
  }
  
  trait FormItemPrefixContextProps extends StObject {
    
    var prefixCls: String
    
    var status: js.UndefOr[ValidateStatus] = js.undefined
  }
  object FormItemPrefixContextProps {
    
    inline def apply(prefixCls: String): FormItemPrefixContextProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormItemPrefixContextProps]
    }
    
    extension [Self <: FormItemPrefixContextProps](x: Self) {
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: ValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<rc-field-form.rc-field-form/es/FormContext.FormProviderProps, 'validateMessages'> */
  trait FormProviderProps extends StObject {
    
    var onFormChange: js.UndefOr[js.Function2[/* name */ String, /* info */ FormChangeInfo, Unit]] = js.undefined
    
    var onFormFinish: js.UndefOr[js.Function2[/* name */ String, /* info */ FormFinishInfo, Unit]] = js.undefined
  }
  object FormProviderProps {
    
    inline def apply(): FormProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProviderProps]
    }
    
    extension [Self <: FormProviderProps](x: Self) {
      
      inline def setOnFormChange(value: (/* name */ String, /* info */ FormChangeInfo) => Unit): Self = StObject.set(x, "onFormChange", js.Any.fromFunction2(value))
      
      inline def setOnFormChangeUndefined: Self = StObject.set(x, "onFormChange", js.undefined)
      
      inline def setOnFormFinish(value: (/* name */ String, /* info */ FormFinishInfo) => Unit): Self = StObject.set(x, "onFormFinish", js.Any.fromFunction2(value))
      
      inline def setOnFormFinishUndefined: Self = StObject.set(x, "onFormFinish", js.undefined)
    }
  }
}
