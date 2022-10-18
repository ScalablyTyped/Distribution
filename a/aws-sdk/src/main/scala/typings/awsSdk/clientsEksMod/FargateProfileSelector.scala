package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FargateProfileSelector extends StObject {
  
  /**
    * The Kubernetes labels that the selector should match. A pod must contain all of the labels that are specified in the selector for it to be considered a match.
    */
  var labels: js.UndefOr[FargateProfileLabel] = js.undefined
  
  /**
    * The Kubernetes namespace that the selector should match.
    */
  var namespace: js.UndefOr[String] = js.undefined
}
object FargateProfileSelector {
  
  inline def apply(): FargateProfileSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FargateProfileSelector]
  }
  
  extension [Self <: FargateProfileSelector](x: Self) {
    
    inline def setLabels(value: FargateProfileLabel): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
