package typings.admZip.anon

import typings.node.NodeJS.ArrayBufferView
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.WriteFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofwriteFile extends StObject {
  
  def apply(file: PathOrFileDescriptor, data: String, options: WriteFileOptions, callback: NoParamCallback): Unit = js.native
  def apply(
    file: PathOrFileDescriptor,
    data: ArrayBufferView,
    options: WriteFileOptions,
    callback: NoParamCallback
  ): Unit = js.native
  def apply(path: PathOrFileDescriptor, data: String, callback: NoParamCallback): Unit = js.native
  def apply(path: PathOrFileDescriptor, data: ArrayBufferView, callback: NoParamCallback): Unit = js.native
}
