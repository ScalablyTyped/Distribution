package typings.activexScripting

import typings.activexScripting.Scripting.CompareMethod
import typings.activexScripting.Scripting.DriveTypeConst
import typings.activexScripting.Scripting.FileAttribute
import typings.activexScripting.Scripting.IOMode
import typings.activexScripting.Scripting.SpecialFolderConst
import typings.activexScripting.Scripting.StandardStreamTypes
import typings.activexScripting.Scripting.Tristate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object activexScriptingNumbers {
  @js.native
  sealed trait `-1` extends Tristate
  
  @js.native
  sealed trait `-2` extends Tristate
  
  @js.native
  sealed trait `0`
    extends CompareMethod
       with DriveTypeConst
       with FileAttribute
       with SpecialFolderConst
       with StandardStreamTypes
       with Tristate
  
  @js.native
  sealed trait `1`
    extends CompareMethod
       with DriveTypeConst
       with FileAttribute
       with IOMode
       with SpecialFolderConst
       with StandardStreamTypes
  
  @js.native
  sealed trait `1024` extends FileAttribute
  
  @js.native
  sealed trait `16` extends FileAttribute
  
  @js.native
  sealed trait `2`
    extends CompareMethod
       with DriveTypeConst
       with FileAttribute
       with IOMode
       with SpecialFolderConst
       with StandardStreamTypes
  
  @js.native
  sealed trait `2048` extends FileAttribute
  
  @js.native
  sealed trait `3` extends DriveTypeConst
  
  @js.native
  sealed trait `32` extends FileAttribute
  
  @js.native
  sealed trait `4`
    extends DriveTypeConst
       with FileAttribute
  
  @js.native
  sealed trait `5` extends DriveTypeConst
  
  @js.native
  sealed trait `8`
    extends FileAttribute
       with IOMode
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `-2`: `-2` = -2.asInstanceOf[`-2`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `1024`: `1024` = 1024.asInstanceOf[`1024`]
  @scala.inline
  def `16`: `16` = 16.asInstanceOf[`16`]
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
  @scala.inline
  def `2048`: `2048` = 2048.asInstanceOf[`2048`]
  @scala.inline
  def `3`: `3` = 3.asInstanceOf[`3`]
  @scala.inline
  def `32`: `32` = 32.asInstanceOf[`32`]
  @scala.inline
  def `4`: `4` = 4.asInstanceOf[`4`]
  @scala.inline
  def `5`: `5` = 5.asInstanceOf[`5`]
  @scala.inline
  def `8`: `8` = 8.asInstanceOf[`8`]
}

