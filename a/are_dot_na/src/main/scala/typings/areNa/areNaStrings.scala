package typings.areNa

import typings.areNa.mod.BlockType
import typings.areNa.mod.ChannelKind
import typings.areNa.mod.ChannelStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areNaStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with ChannelKind
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait Attachment
    extends StObject
       with BlockType
  inline def Attachment: Attachment = "Attachment".asInstanceOf[Attachment]
  
  @js.native
  sealed trait Image
    extends StObject
       with BlockType
  inline def Image: Image = "Image".asInstanceOf[Image]
  
  @js.native
  sealed trait Link
    extends StObject
       with BlockType
  inline def Link: Link = "Link".asInstanceOf[Link]
  
  @js.native
  sealed trait Media
    extends StObject
       with BlockType
  inline def Media: Media = "Media".asInstanceOf[Media]
  
  @js.native
  sealed trait Text
    extends StObject
       with BlockType
  inline def Text: Text = "Text".asInstanceOf[Text]
  
  @js.native
  sealed trait closed
    extends StObject
       with ChannelStatus
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait open
    extends StObject
       with ChannelStatus
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait `private`
    extends StObject
       with ChannelStatus
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait profile
    extends StObject
       with ChannelKind
  inline def profile: profile = "profile".asInstanceOf[profile]
}
