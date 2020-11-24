package typings.activexLibreoffice.com_.sun.star.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** the {@link com.sun.star.media.XPlayer} factory interface */
@js.native
trait XManager extends js.Object {
  
  /**
    * creates a new media player
    * @param aURL the URL of the media to play
    */
  def createPlayer(aURL: String): XPlayer = js.native
}
object XManager {
  
  @scala.inline
  def apply(createPlayer: String => XPlayer): XManager = {
    val __obj = js.Dynamic.literal(createPlayer = js.Any.fromFunction1(createPlayer))
    __obj.asInstanceOf[XManager]
  }
  
  @scala.inline
  implicit class XManagerOps[Self <: XManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatePlayer(value: String => XPlayer): Self = this.set("createPlayer", js.Any.fromFunction1(value))
  }
}
