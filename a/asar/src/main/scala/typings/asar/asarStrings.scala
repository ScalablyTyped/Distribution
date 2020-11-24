package typings.asar

import typings.asar.mod.InputMetadataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asarStrings {
  
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait directory extends InputMetadataType
  
  @js.native
  sealed trait file extends InputMetadataType
  
  @js.native
  sealed trait link extends InputMetadataType
}
