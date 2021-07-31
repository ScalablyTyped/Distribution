package typings.asar

import typings.asar.mod.InputMetadataType
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Stat extends StObject {
    
    var stat: Stats
    
    var `type`: InputMetadataType
  }
  object Stat {
    
    @scala.inline
    def apply(stat: Stats, `type`: InputMetadataType): Stat = {
      val __obj = js.Dynamic.literal(stat = stat.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stat]
    }
    
    @scala.inline
    implicit class StatMutableBuilder[Self <: Stat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: InputMetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
