package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BIncomingQueueBlocked extends StObject {
  
  val bIncomingQueueBlocked: Boolean
  
  val bOutgoingQueueBlocked: Boolean
  
  val bOutgoingQueuePaused: Boolean
  
  val pFaxServer: FaxServer
}
object BIncomingQueueBlocked {
  
  @scala.inline
  def apply(
    bIncomingQueueBlocked: Boolean,
    bOutgoingQueueBlocked: Boolean,
    bOutgoingQueuePaused: Boolean,
    pFaxServer: FaxServer
  ): BIncomingQueueBlocked = {
    val __obj = js.Dynamic.literal(bIncomingQueueBlocked = bIncomingQueueBlocked.asInstanceOf[js.Any], bOutgoingQueueBlocked = bOutgoingQueueBlocked.asInstanceOf[js.Any], bOutgoingQueuePaused = bOutgoingQueuePaused.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BIncomingQueueBlocked]
  }
  
  @scala.inline
  implicit class BIncomingQueueBlockedMutableBuilder[Self <: BIncomingQueueBlocked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBIncomingQueueBlocked(value: Boolean): Self = StObject.set(x, "bIncomingQueueBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBOutgoingQueueBlocked(value: Boolean): Self = StObject.set(x, "bOutgoingQueueBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBOutgoingQueuePaused(value: Boolean): Self = StObject.set(x, "bOutgoingQueuePaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPFaxServer(value: FaxServer): Self = StObject.set(x, "pFaxServer", value.asInstanceOf[js.Any])
  }
}
