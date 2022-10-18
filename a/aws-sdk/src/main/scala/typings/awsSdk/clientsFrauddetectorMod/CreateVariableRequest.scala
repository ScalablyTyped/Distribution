package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVariableRequest extends StObject {
  
  /**
    * The source of the data.
    */
  var dataSource: DataSource
  
  /**
    * The data type.
    */
  var dataType: DataType
  
  /**
    * The default value for the variable when no value is received.
    */
  var defaultValue: String
  
  /**
    * The description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the variable.
    */
  var name: String
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.undefined
  
  /**
    * The variable type. For more information see Variable types.  Valid Values: AUTH_CODE | AVS | BILLING_ADDRESS_L1 | BILLING_ADDRESS_L2 | BILLING_CITY | BILLING_COUNTRY | BILLING_NAME | BILLING_PHONE | BILLING_STATE | BILLING_ZIP | CARD_BIN | CATEGORICAL | CURRENCY_CODE | EMAIL_ADDRESS | FINGERPRINT | FRAUD_LABEL | FREE_FORM_TEXT | IP_ADDRESS | NUMERIC | ORDER_ID | PAYMENT_TYPE | PHONE_NUMBER | PRICE | PRODUCT_CATEGORY | SHIPPING_ADDRESS_L1 | SHIPPING_ADDRESS_L2 | SHIPPING_CITY | SHIPPING_COUNTRY | SHIPPING_NAME | SHIPPING_PHONE | SHIPPING_STATE | SHIPPING_ZIP | USERAGENT 
    */
  var variableType: js.UndefOr[String] = js.undefined
}
object CreateVariableRequest {
  
  inline def apply(dataSource: DataSource, dataType: DataType, defaultValue: String, name: String): CreateVariableRequest = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVariableRequest]
  }
  
  extension [Self <: CreateVariableRequest](x: Self) {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVariableType(value: String): Self = StObject.set(x, "variableType", value.asInstanceOf[js.Any])
    
    inline def setVariableTypeUndefined: Self = StObject.set(x, "variableType", js.undefined)
  }
}
