package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DeltaDirectTarget extends StObject {
  
  /**
    * Specifies additional connection options for the connector.
    */
  var AdditionalOptions: js.UndefOr[typings.awsSdk.clientsGlueMod.AdditionalOptions] = js.undefined
  
  /**
    * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension. Possible values are "gzip" and "bzip").
    */
  var Compression: DeltaTargetCompressionType
  
  /**
    * Specifies the data output format for the target.
    */
  var Format: TargetFormat
  
  /**
    * The nodes that are inputs to the data target.
    */
  var Inputs: OneInput
  
  /**
    * The name of the data target.
    */
  var Name: NodeName
  
  /**
    * Specifies native partitioning using a sequence of keys.
    */
  var PartitionKeys: js.UndefOr[GlueStudioPathList] = js.undefined
  
  /**
    * The Amazon S3 path of your Delta Lake data source to write to.
    */
  var Path: EnclosedInStringProperty
  
  /**
    * A policy that specifies update behavior for the crawler.
    */
  var SchemaChangePolicy: js.UndefOr[DirectSchemaChangePolicy] = js.undefined
}
object S3DeltaDirectTarget {
  
  inline def apply(
    Compression: DeltaTargetCompressionType,
    Format: TargetFormat,
    Inputs: OneInput,
    Name: NodeName,
    Path: EnclosedInStringProperty
  ): S3DeltaDirectTarget = {
    val __obj = js.Dynamic.literal(Compression = Compression.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DeltaDirectTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3DeltaDirectTarget] (val x: Self) extends AnyVal {
    
    inline def setAdditionalOptions(value: AdditionalOptions): Self = StObject.set(x, "AdditionalOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOptionsUndefined: Self = StObject.set(x, "AdditionalOptions", js.undefined)
    
    inline def setCompression(value: DeltaTargetCompressionType): Self = StObject.set(x, "Compression", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: TargetFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: OneInput): Self = StObject.set(x, "Inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: NodeId*): Self = StObject.set(x, "Inputs", js.Array(value*))
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeys(value: GlueStudioPathList): Self = StObject.set(x, "PartitionKeys", value.asInstanceOf[js.Any])
    
    inline def setPartitionKeysUndefined: Self = StObject.set(x, "PartitionKeys", js.undefined)
    
    inline def setPartitionKeysVarargs(value: EnclosedInStringProperties*): Self = StObject.set(x, "PartitionKeys", js.Array(value*))
    
    inline def setPath(value: EnclosedInStringProperty): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setSchemaChangePolicy(value: DirectSchemaChangePolicy): Self = StObject.set(x, "SchemaChangePolicy", value.asInstanceOf[js.Any])
    
    inline def setSchemaChangePolicyUndefined: Self = StObject.set(x, "SchemaChangePolicy", js.undefined)
  }
}
