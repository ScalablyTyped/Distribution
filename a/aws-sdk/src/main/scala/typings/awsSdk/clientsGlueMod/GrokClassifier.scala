package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrokClassifier extends StObject {
  
  /**
    * An identifier of the data format that the classifier matches, such as Twitter, JSON, Omniture logs, and so on.
    */
  var Classification: typings.awsSdk.clientsGlueMod.Classification
  
  /**
    * The time that this classifier was registered.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Optional custom grok patterns defined by this classifier. For more information, see custom patterns in Writing Custom Classifiers.
    */
  var CustomPatterns: js.UndefOr[typings.awsSdk.clientsGlueMod.CustomPatterns] = js.undefined
  
  /**
    * The grok pattern applied to a data store by this classifier. For more information, see built-in patterns in Writing Custom Classifiers.
    */
  var GrokPattern: typings.awsSdk.clientsGlueMod.GrokPattern
  
  /**
    * The time that this classifier was last updated.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the classifier.
    */
  var Name: NameString
  
  /**
    * The version of this classifier.
    */
  var Version: js.UndefOr[VersionId] = js.undefined
}
object GrokClassifier {
  
  inline def apply(Classification: Classification, GrokPattern: GrokPattern, Name: NameString): GrokClassifier = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], GrokPattern = GrokPattern.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrokClassifier]
  }
  
  extension [Self <: GrokClassifier](x: Self) {
    
    inline def setClassification(value: Classification): Self = StObject.set(x, "Classification", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCustomPatterns(value: CustomPatterns): Self = StObject.set(x, "CustomPatterns", value.asInstanceOf[js.Any])
    
    inline def setCustomPatternsUndefined: Self = StObject.set(x, "CustomPatterns", js.undefined)
    
    inline def setGrokPattern(value: GrokPattern): Self = StObject.set(x, "GrokPattern", value.asInstanceOf[js.Any])
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionId): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
