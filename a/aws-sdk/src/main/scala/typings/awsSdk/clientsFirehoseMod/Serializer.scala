package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Serializer extends StObject {
  
  /**
    * A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information, see Apache ORC.
    */
  var OrcSerDe: js.UndefOr[typings.awsSdk.clientsFirehoseMod.OrcSerDe] = js.undefined
  
  /**
    * A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more information, see Apache Parquet.
    */
  var ParquetSerDe: js.UndefOr[typings.awsSdk.clientsFirehoseMod.ParquetSerDe] = js.undefined
}
object Serializer {
  
  inline def apply(): Serializer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Serializer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Serializer] (val x: Self) extends AnyVal {
    
    inline def setOrcSerDe(value: OrcSerDe): Self = StObject.set(x, "OrcSerDe", value.asInstanceOf[js.Any])
    
    inline def setOrcSerDeUndefined: Self = StObject.set(x, "OrcSerDe", js.undefined)
    
    inline def setParquetSerDe(value: ParquetSerDe): Self = StObject.set(x, "ParquetSerDe", value.asInstanceOf[js.Any])
    
    inline def setParquetSerDeUndefined: Self = StObject.set(x, "ParquetSerDe", js.undefined)
  }
}
