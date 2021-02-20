package typings.asar

import typings.asar.mod.InputMetadataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asarStrings {
  
  @js.native
  sealed trait directory extends InputMetadataType
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  
  @js.native
  sealed trait file extends InputMetadataType
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait link extends InputMetadataType
  @scala.inline
  def link: link = "link".asInstanceOf[link]
}
