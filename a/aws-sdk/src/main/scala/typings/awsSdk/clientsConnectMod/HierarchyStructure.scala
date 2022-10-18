package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchyStructure extends StObject {
  
  /**
    * Information about level five.
    */
  var LevelFive: js.UndefOr[HierarchyLevel] = js.undefined
  
  /**
    * Information about level four.
    */
  var LevelFour: js.UndefOr[HierarchyLevel] = js.undefined
  
  /**
    * Information about level one.
    */
  var LevelOne: js.UndefOr[HierarchyLevel] = js.undefined
  
  /**
    * Information about level three.
    */
  var LevelThree: js.UndefOr[HierarchyLevel] = js.undefined
  
  /**
    * Information about level two.
    */
  var LevelTwo: js.UndefOr[HierarchyLevel] = js.undefined
}
object HierarchyStructure {
  
  inline def apply(): HierarchyStructure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HierarchyStructure]
  }
  
  extension [Self <: HierarchyStructure](x: Self) {
    
    inline def setLevelFive(value: HierarchyLevel): Self = StObject.set(x, "LevelFive", value.asInstanceOf[js.Any])
    
    inline def setLevelFiveUndefined: Self = StObject.set(x, "LevelFive", js.undefined)
    
    inline def setLevelFour(value: HierarchyLevel): Self = StObject.set(x, "LevelFour", value.asInstanceOf[js.Any])
    
    inline def setLevelFourUndefined: Self = StObject.set(x, "LevelFour", js.undefined)
    
    inline def setLevelOne(value: HierarchyLevel): Self = StObject.set(x, "LevelOne", value.asInstanceOf[js.Any])
    
    inline def setLevelOneUndefined: Self = StObject.set(x, "LevelOne", js.undefined)
    
    inline def setLevelThree(value: HierarchyLevel): Self = StObject.set(x, "LevelThree", value.asInstanceOf[js.Any])
    
    inline def setLevelThreeUndefined: Self = StObject.set(x, "LevelThree", js.undefined)
    
    inline def setLevelTwo(value: HierarchyLevel): Self = StObject.set(x, "LevelTwo", value.asInstanceOf[js.Any])
    
    inline def setLevelTwoUndefined: Self = StObject.set(x, "LevelTwo", js.undefined)
  }
}
