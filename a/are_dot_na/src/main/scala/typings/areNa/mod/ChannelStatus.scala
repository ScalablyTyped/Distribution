package typings.areNa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Can be "private" (only open for reading and adding to the channel by channel author and collaborators),
  * "closed" (open for reading by everyone, only channel author and collaborators can add) or "public"
  * (everyone can read and add to the channel)
  */
/* Rewritten from type alias, can be one of: 
  - typings.areNa.areNaStrings.`private`
  - typings.areNa.areNaStrings.closed
  - typings.areNa.areNaStrings.open
*/
trait ChannelStatus extends StObject
object ChannelStatus {
  
  inline def closed: typings.areNa.areNaStrings.closed = "closed".asInstanceOf[typings.areNa.areNaStrings.closed]
  
  inline def open: typings.areNa.areNaStrings.open = "open".asInstanceOf[typings.areNa.areNaStrings.open]
  
  inline def `private`: typings.areNa.areNaStrings.`private` = "private".asInstanceOf[typings.areNa.areNaStrings.`private`]
}
