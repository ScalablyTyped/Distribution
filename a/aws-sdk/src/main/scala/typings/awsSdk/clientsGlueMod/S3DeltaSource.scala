package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DeltaSource extends StObject {
  
  /**
    * Specifies additional connection options.
    */
  var AdditionalDeltaOptions: js.UndefOr[AdditionalOptions] = js.undefined
  
  /**
    * Specifies additional options for the connector.
    */
  var AdditionalOptions: js.UndefOr[S3DirectSourceAdditionalOptions] = js.undefined
  
  /**
    * The name of the Delta Lake source.
    */
  var Name: NodeName
  
  /**
    * Specifies the data schema for the Delta Lake source.
    */
  var OutputSchemas: js.UndefOr[GlueSchemas] = js.undefined
  
  /**
    * A list of the Amazon S3 paths to read from.
    */
  var Paths: EnclosedInStringProperties
}
object S3DeltaSource {
  
  inline def apply(Name: NodeName, Paths: EnclosedInStringProperties): S3DeltaSource = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Paths = Paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DeltaSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3DeltaSource] (val x: Self) extends AnyVal {
    
    inline def setAdditionalDeltaOptions(value: AdditionalOptions): Self = StObject.set(x, "AdditionalDeltaOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDeltaOptionsUndefined: Self = StObject.set(x, "AdditionalDeltaOptions", js.undefined)
    
    inline def setAdditionalOptions(value: S3DirectSourceAdditionalOptions): Self = StObject.set(x, "AdditionalOptions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOptionsUndefined: Self = StObject.set(x, "AdditionalOptions", js.undefined)
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemas(value: GlueSchemas): Self = StObject.set(x, "OutputSchemas", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemasUndefined: Self = StObject.set(x, "OutputSchemas", js.undefined)
    
    inline def setOutputSchemasVarargs(value: GlueSchema*): Self = StObject.set(x, "OutputSchemas", js.Array(value*))
    
    inline def setPaths(value: EnclosedInStringProperties): Self = StObject.set(x, "Paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: EnclosedInStringProperty*): Self = StObject.set(x, "Paths", js.Array(value*))
  }
}
