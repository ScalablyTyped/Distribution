package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to seek to a certain position within a stream.
  *
  * This interface should be supported, if it is possible to access the data at the new position quickly. You should not support this interface, if you
  * have a continuous stream, for example, a video stream.
  */
@js.native
trait XSeekable extends XInterface {
  
  /**
    * returns the length of the stream.
    * @returns the length of the storage medium on which the stream works.
    */
  val Length: Double = js.native
  
  /**
    * returns the current offset of the stream.
    * @returns the current offset in this stream.
    */
  val Position: Double = js.native
  
  /**
    * returns the length of the stream.
    * @returns the length of the storage medium on which the stream works.
    */
  def getLength(): Double = js.native
  
  /**
    * returns the current offset of the stream.
    * @returns the current offset in this stream.
    */
  def getPosition(): Double = js.native
  
  /**
    * changes the seek pointer to a new location relative to the beginning of the stream.
    *
    * This method changes the seek pointer so subsequent reads and writes can take place at a different location in the stream object. It is an error to
    * seek before the beginning of the stream or after the end of the stream.
    * @throws com::sun::star::lang::IllegalArgumentException in case location is negative or greater than {@link XSeekable.getLength()} .
    */
  def seek(location: Double): Unit = js.native
}
object XSeekable {
  
  @scala.inline
  def apply(
    Length: Double,
    Position: Double,
    acquire: () => Unit,
    getLength: () => Double,
    getPosition: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    seek: Double => Unit
  ): XSeekable = {
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLength = js.Any.fromFunction0(getLength), getPosition = js.Any.fromFunction0(getPosition), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), seek = js.Any.fromFunction1(seek))
    __obj.asInstanceOf[XSeekable]
  }
  
  @scala.inline
  implicit class XSeekableOps[Self <: XSeekable] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("Length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosition(value: () => Double): Self = this.set("getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSeek(value: Double => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
  }
}
