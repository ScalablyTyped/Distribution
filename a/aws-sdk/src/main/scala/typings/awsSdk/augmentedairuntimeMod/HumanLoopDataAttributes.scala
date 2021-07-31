package typings.awsSdk.augmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HumanLoopDataAttributes extends StObject {
  
  /**
    * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker can restrict the Amazon Mechanical Turk workers who can view your task based on this information.
    */
  var ContentClassifiers: typings.awsSdk.augmentedairuntimeMod.ContentClassifiers
}
object HumanLoopDataAttributes {
  
  @scala.inline
  def apply(ContentClassifiers: ContentClassifiers): HumanLoopDataAttributes = {
    val __obj = js.Dynamic.literal(ContentClassifiers = ContentClassifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopDataAttributes]
  }
  
  @scala.inline
  implicit class HumanLoopDataAttributesMutableBuilder[Self <: HumanLoopDataAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentClassifiers(value: ContentClassifiers): Self = StObject.set(x, "ContentClassifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentClassifiersVarargs(value: ContentClassifier*): Self = StObject.set(x, "ContentClassifiers", js.Array(value :_*))
  }
}
