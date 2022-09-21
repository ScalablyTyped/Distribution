package typings.applestAtem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Model extends StObject
@JSImport("applest-atem", "Model")
@js.native
object Model extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Model & Double] = js.native
  
  @js.native
  sealed trait `1ME`
    extends StObject
       with Model
  /* 0x02 */ val `1ME`: typings.applestAtem.mod.Model.`1ME` & Double = js.native
  
  @js.native
  sealed trait `1ME4K`
    extends StObject
       with Model
  /* 0x05 */ val `1ME4K`: typings.applestAtem.mod.Model.`1ME4K` & Double = js.native
  
  @js.native
  sealed trait `2ME`
    extends StObject
       with Model
  /* 0x03 */ val `2ME`: typings.applestAtem.mod.Model.`2ME` & Double = js.native
  
  @js.native
  sealed trait `2ME4K`
    extends StObject
       with Model
  /* 0x06 */ val `2ME4K`: typings.applestAtem.mod.Model.`2ME4K` & Double = js.native
  
  @js.native
  sealed trait `2MEBS4K`
    extends StObject
       with Model
  /* 0x07 */ val `2MEBS4K`: typings.applestAtem.mod.Model.`2MEBS4K` & Double = js.native
  
  @js.native
  sealed trait PS4K
    extends StObject
       with Model
  /* 0x04 */ val PS4K: typings.applestAtem.mod.Model.PS4K & Double = js.native
  
  @js.native
  sealed trait TVS
    extends StObject
       with Model
  /* 0x01 */ val TVS: typings.applestAtem.mod.Model.TVS & Double = js.native
}
