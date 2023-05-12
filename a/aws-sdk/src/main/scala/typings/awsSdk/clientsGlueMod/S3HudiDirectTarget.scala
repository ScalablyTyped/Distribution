package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3HudiDirectTarget extends StObject {
  
  /**
    * Specifies additional connection options for the connector.
    */
  var AdditionalOptions: typings.awsSdk.clientsGlueMod.AdditionalOptions
  
  /**
    * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension. Possible values are "gzip" and "bzip").
    */
  var Compression: HudiTargetCompressionType
  
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
    * The Amazon S3 path of your Hudi data source to write to.
    */
  var Path: EnclosedInStringProperty
  
  /**
    * A policy that specifies update behavior for the crawler.
    */
  var SchemaChangePolicy: js.UndefOr[DirectSchemaChangePolicy] = js.undefined
}
object S3HudiDirectTarget {
  
  inline def apply(
    AdditionalOptions: AdditionalOptions,
    Compression: HudiTargetCompressionType,
    Format: TargetFormat,
    Inputs: OneInput,
    Name: NodeName,
    Path: EnclosedInStringProperty
  ): S3HudiDirectTarget = {
    val __obj = js.Dynamic.literal(AdditionalOptions = AdditionalOptions.asInstanceOf[js.Any], Compression = Compression.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Inputs = Inputs.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3HudiDirectTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3HudiDirectTarget] (val x: Self) extends AnyVal {
    
    inline def setAdditionalOptions(value: AdditionalOptions): Self = StObject.set(x, "AdditionalOptions", value.asInstanceOf[js.Any])
    
    inline def setCompression(value: HudiTargetCompressionType): Self = StObject.set(x, "Compression", value.asInstanceOf[js.Any])
    
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
