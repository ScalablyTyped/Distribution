package typings.applestAtem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConnectionState extends StObject
@JSImport("applest-atem", "ConnectionState")
@js.native
object ConnectionState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConnectionState & Double] = js.native
  
  @js.native
  sealed trait Closed
    extends StObject
       with ConnectionState
  /* 0x03 */ val Closed: typings.applestAtem.mod.ConnectionState.Closed & Double = js.native
  
  @js.native
  sealed trait Established
    extends StObject
       with ConnectionState
  /* 0x02 */ val Established: typings.applestAtem.mod.ConnectionState.Established & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ConnectionState
  /* 0x00 */ val None: typings.applestAtem.mod.ConnectionState.None & Double = js.native
  
  @js.native
  sealed trait SynSent
    extends StObject
       with ConnectionState
  /* 0x01 */ val SynSent: typings.applestAtem.mod.ConnectionState.SynSent & Double = js.native
}
