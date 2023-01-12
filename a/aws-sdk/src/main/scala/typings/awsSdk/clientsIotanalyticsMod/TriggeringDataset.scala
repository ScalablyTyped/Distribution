package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggeringDataset extends StObject {
  
  /**
    * The name of the dataset whose content generation triggers the new dataset content generation.
    */
  var name: DatasetName
}
object TriggeringDataset {
  
  inline def apply(name: DatasetName): TriggeringDataset = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggeringDataset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggeringDataset] (val x: Self) extends AnyVal {
    
    inline def setName(value: DatasetName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
