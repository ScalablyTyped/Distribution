package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detection extends StObject {
  
  /**
    * If the sensitive data was detected by a custom data identifier, the Amazon Resource Name (ARN) of the custom data identifier that detected the data. Otherwise, this value is null.
    */
  var arn: js.UndefOr[string] = js.undefined
  
  /**
    * The total number of occurrences of the sensitive data.
    */
  var count: js.UndefOr[long] = js.undefined
  
  /**
    * The unique identifier for the custom data identifier or managed data identifier that detected the sensitive data. For additional details about a specified managed data identifier, see Using managed data identifiers in the Amazon Macie User Guide.
    */
  var id: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the custom data identifier or managed data identifier that detected the sensitive data. For a managed data identifier, this value is the same as the unique identifier (id).
    */
  var name: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether occurrences of this type of sensitive data are excluded (true) or included (false) in the bucket's sensitivity score.
    */
  var suppressed: js.UndefOr[boolean] = js.undefined
  
  /**
    * The type of data identifier that detected the sensitive data. Possible values are: CUSTOM, for a custom data identifier; and, MANAGED, for a managed data identifier.
    */
  var `type`: js.UndefOr[DataIdentifierType] = js.undefined
}
object Detection {
  
  inline def apply(): Detection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Detection] (val x: Self) extends AnyVal {
    
    inline def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSuppressed(value: boolean): Self = StObject.set(x, "suppressed", value.asInstanceOf[js.Any])
    
    inline def setSuppressedUndefined: Self = StObject.set(x, "suppressed", js.undefined)
    
    inline def setType(value: DataIdentifierType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
