package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Atlassiandark extends StObject {
  
  var `atlassian-dark`: String
  
  var `atlassian-legacy-dark`: String
  
  var `atlassian-legacy-light`: String
  
  var `atlassian-light`: String
}
object Atlassiandark {
  
  inline def apply(
    `atlassian-dark`: String,
    `atlassian-legacy-dark`: String,
    `atlassian-legacy-light`: String,
    `atlassian-light`: String
  ): Atlassiandark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("atlassian-dark")(`atlassian-dark`.asInstanceOf[js.Any])
    __obj.updateDynamic("atlassian-legacy-dark")(`atlassian-legacy-dark`.asInstanceOf[js.Any])
    __obj.updateDynamic("atlassian-legacy-light")(`atlassian-legacy-light`.asInstanceOf[js.Any])
    __obj.updateDynamic("atlassian-light")(`atlassian-light`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atlassiandark]
  }
  
  extension [Self <: Atlassiandark](x: Self) {
    
    inline def `setAtlassian-dark`(value: String): Self = StObject.set(x, "atlassian-dark", value.asInstanceOf[js.Any])
    
    inline def `setAtlassian-legacy-dark`(value: String): Self = StObject.set(x, "atlassian-legacy-dark", value.asInstanceOf[js.Any])
    
    inline def `setAtlassian-legacy-light`(value: String): Self = StObject.set(x, "atlassian-legacy-light", value.asInstanceOf[js.Any])
    
    inline def `setAtlassian-light`(value: String): Self = StObject.set(x, "atlassian-light", value.asInstanceOf[js.Any])
  }
}
