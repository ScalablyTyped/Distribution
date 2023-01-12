package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deserializer extends StObject {
  
  /**
    * The native Hive / HCatalog JsonSerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the OpenX SerDe.
    */
  var HiveJsonSerDe: js.UndefOr[typings.awsSdk.clientsFirehoseMod.HiveJsonSerDe] = js.undefined
  
  /**
    * The OpenX SerDe. Used by Kinesis Data Firehose for deserializing data, which means converting it from the JSON format in preparation for serializing it to the Parquet or ORC format. This is one of two deserializers you can choose, depending on which one offers the functionality you need. The other option is the native Hive / HCatalog JsonSerDe.
    */
  var OpenXJsonSerDe: js.UndefOr[typings.awsSdk.clientsFirehoseMod.OpenXJsonSerDe] = js.undefined
}
object Deserializer {
  
  inline def apply(): Deserializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deserializer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deserializer] (val x: Self) extends AnyVal {
    
    inline def setHiveJsonSerDe(value: HiveJsonSerDe): Self = StObject.set(x, "HiveJsonSerDe", value.asInstanceOf[js.Any])
    
    inline def setHiveJsonSerDeUndefined: Self = StObject.set(x, "HiveJsonSerDe", js.undefined)
    
    inline def setOpenXJsonSerDe(value: OpenXJsonSerDe): Self = StObject.set(x, "OpenXJsonSerDe", value.asInstanceOf[js.Any])
    
    inline def setOpenXJsonSerDeUndefined: Self = StObject.set(x, "OpenXJsonSerDe", js.undefined)
  }
}
