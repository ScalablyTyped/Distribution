package typings.agilite

import typings.agilite.distAgiliteInterfaceMod.ConfigInterface
import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModulesKeywordsControllerMod {
  
  @JSImport("agilite/dist/modules/keywords/controller", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Keywords {
    def this(config: ConfigInterface) = this()
  }
  
  @js.native
  trait Keywords extends StObject {
    
    var apiKey: String = js.native
    
    var apiServerUrl: String = js.native
    
    def deleteData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def deleteData(recordId: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String], recordIds: js.Array[String], slimResult: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(
      profileKeys: js.Array[String],
      recordIds: js.Array[String],
      slimResult: Boolean,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(
      profileKeys: js.Array[String],
      recordIds: js.Array[String],
      slimResult: Unit,
      logProfileKey: String
    ): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String], recordIds: Unit, slimResult: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String], recordIds: Unit, slimResult: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: js.Array[String], recordIds: Unit, slimResult: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: js.Array[String]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: js.Array[String], slimResult: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: js.Array[String], slimResult: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: js.Array[String], slimResult: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: Unit, slimResult: Boolean): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: Unit, slimResult: Boolean, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getData(profileKeys: Unit, recordIds: Unit, slimResult: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getLabelByValue(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: String, value: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: String, value: String, outputFormat: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: String, value: String, outputFormat: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: String, value: String, outputFormat: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: String, value: Unit, outputFormat: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: String, value: Unit, outputFormat: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: String, value: Unit, outputFormat: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: Unit, value: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: Unit, value: String, outputFormat: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: Unit, value: String, outputFormat: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: Unit, value: String, outputFormat: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: Unit, value: Unit, outputFormat: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: Unit, value: Unit, outputFormat: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getLabelByValue(profileKey: Unit, value: Unit, outputFormat: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getProfileKeysByGroup(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getProfileKeysByGroup(groupName: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getProfileKeysByGroup(groupName: String, sort: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getProfileKeysByGroup(groupName: String, sort: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getProfileKeysByGroup(groupName: String, sort: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getProfileKeysByGroup(groupName: Unit, sort: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getProfileKeysByGroup(groupName: Unit, sort: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getProfileKeysByGroup(groupName: Unit, sort: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getValueByLabel(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: String, label: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: String, label: String, outputFormat: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: String, label: String, outputFormat: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: String, label: String, outputFormat: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: String, label: Unit, outputFormat: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: String, label: Unit, outputFormat: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: String, label: Unit, outputFormat: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: Unit, label: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: Unit, label: String, outputFormat: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: Unit, label: String, outputFormat: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: Unit, label: String, outputFormat: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: Unit, label: Unit, outputFormat: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: Unit, label: Unit, outputFormat: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValueByLabel(profileKey: Unit, label: Unit, outputFormat: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def getValuesByProfileKey(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: String, sort: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: String, sort: String, outputFormat: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: String, sort: String, outputFormat: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: String, sort: String, outputFormat: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: String, sort: Unit, outputFormat: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: String, sort: Unit, outputFormat: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: String, sort: Unit, outputFormat: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: Unit, sort: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: Unit, sort: String, outputFormat: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: Unit, sort: String, outputFormat: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: Unit, sort: String, outputFormat: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: Unit, sort: Unit, outputFormat: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: Unit, sort: Unit, outputFormat: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def getValuesByProfileKey(profileKey: Unit, sort: Unit, outputFormat: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var outputFormat: OutputFormat = js.native
    
    def postData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def postData(data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def postData(data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def postData(data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def putData(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: String, data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Any): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Any, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def putData(recordId: Unit, data: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def setLabelByValue(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: String, valueKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: String, valueKey: String, label: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: String, valueKey: String, label: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: String, valueKey: String, label: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: String, valueKey: Unit, label: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: String, valueKey: Unit, label: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: String, valueKey: Unit, label: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: Unit, valueKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: Unit, valueKey: String, label: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: Unit, valueKey: String, label: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: Unit, valueKey: String, label: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: Unit, valueKey: Unit, label: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: Unit, valueKey: Unit, label: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setLabelByValue(profileKey: Unit, valueKey: Unit, label: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def setValueByLabel(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: String, labelKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: String, labelKey: String, value: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: String, labelKey: String, value: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: String, labelKey: String, value: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: String, labelKey: Unit, value: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: String, labelKey: Unit, value: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: String, labelKey: Unit, value: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: Unit, labelKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: Unit, labelKey: String, value: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: Unit, labelKey: String, value: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: Unit, labelKey: String, value: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: Unit, labelKey: Unit, value: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: Unit, labelKey: Unit, value: String, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValueByLabel(profileKey: Unit, labelKey: Unit, value: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    def setValuesByProfileKey(): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValuesByProfileKey(profileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValuesByProfileKey(profileKey: String, values: js.Array[Values]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValuesByProfileKey(profileKey: String, values: js.Array[Values], logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValuesByProfileKey(profileKey: String, values: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValuesByProfileKey(profileKey: Unit, values: js.Array[Values]): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValuesByProfileKey(profileKey: Unit, values: js.Array[Values], logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    def setValuesByProfileKey(profileKey: Unit, values: Unit, logProfileKey: String): js.Promise[AxiosResponse[Any, Any]] = js.native
    
    var sort: Sort = js.native
    
    var teamId: String = js.native
  }
  
  trait OutputFormat extends StObject {
    
    var JSON: String
    
    var STRING: String
  }
  object OutputFormat {
    
    inline def apply(JSON: String, STRING: String): OutputFormat = {
      val __obj = js.Dynamic.literal(JSON = JSON.asInstanceOf[js.Any], STRING = STRING.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputFormat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutputFormat] (val x: Self) extends AnyVal {
      
      inline def setJSON(value: String): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setSTRING(value: String): Self = StObject.set(x, "STRING", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sort extends StObject {
    
    var ASC: String
    
    var ASC_VALUE: String
    
    var DESC: String
    
    var DESC_VALUE: String
  }
  object Sort {
    
    inline def apply(ASC: String, ASC_VALUE: String, DESC: String, DESC_VALUE: String): Sort = {
      val __obj = js.Dynamic.literal(ASC = ASC.asInstanceOf[js.Any], ASC_VALUE = ASC_VALUE.asInstanceOf[js.Any], DESC = DESC.asInstanceOf[js.Any], DESC_VALUE = DESC_VALUE.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sort]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sort] (val x: Self) extends AnyVal {
      
      inline def setASC(value: String): Self = StObject.set(x, "ASC", value.asInstanceOf[js.Any])
      
      inline def setASC_VALUE(value: String): Self = StObject.set(x, "ASC_VALUE", value.asInstanceOf[js.Any])
      
      inline def setDESC(value: String): Self = StObject.set(x, "DESC", value.asInstanceOf[js.Any])
      
      inline def setDESC_VALUE(value: String): Self = StObject.set(x, "DESC_VALUE", value.asInstanceOf[js.Any])
    }
  }
  
  trait Values extends StObject {
    
    var label: String
    
    var value: String
  }
  object Values {
    
    inline def apply(label: String, value: String): Values = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Values]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Values] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
