package typings.angularFileUpload.mod

import typings.std.File
import typings.std.FileList
import typings.std.HTMLInputElement
import typings.std.Headers
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploader extends FileUploaderOptions {
  /**
    * true if uploader is html5-uploader. Read only.
    */
  var isHTML5: Boolean = js.native
  /**
    * true if an upload is in progress. Read only.
    */
  var isUploading: Boolean = js.native
  /**
    * Upload queue progress percentage. Read only.
    */
  var progress: Double = js.native
  def addToQueue(files: js.Array[js.Object], options: js.Object, filters: String): Unit = js.native
  def addToQueue(files: js.Array[js.Object], options: js.Object, filters: js.Array[Filter]): Unit = js.native
  def addToQueue(files: js.Object, options: js.Object, filters: String): Unit = js.native
  def addToQueue(files: js.Object, options: js.Object, filters: js.Array[Filter]): Unit = js.native
  def addToQueue(files: FileList, options: js.Object, filters: String): Unit = js.native
  def addToQueue(files: FileList, options: js.Object, filters: js.Array[Filter]): Unit = js.native
  def addToQueue(files: File, options: js.Object, filters: String): Unit = js.native
  // **Methods**
  /**
    * Add items to the queue
    */
  def addToQueue(files: File, options: js.Object, filters: js.Array[Filter]): Unit = js.native
  def addToQueue(files: HTMLInputElement, options: js.Object, filters: String): Unit = js.native
  def addToQueue(files: HTMLInputElement, options: js.Object, filters: js.Array[Filter]): Unit = js.native
  /**
    * Cancels all current uploads.
    */
  def cancelAll(): Unit = js.native
  def cancelItem(value: Double): Unit = js.native
  /**
    * Cancels uploading of item, where value is {FileItem} or index of item.
    */
  def cancelItem(value: FileItem): Unit = js.native
  /**
    * Removes all elements from the queue.
    */
  def clearQueue(): Unit = js.native
  /**
    * Destroys a uploader.
    */
  def destroy(): Unit = js.native
  /**
    * Returns the index of the {FileItem} queue element.
    */
  def getIndexOfItem(fileItem: FileItem): Double = js.native
  /**
    * Return an array of all pending items on the queue
    */
  def getNotUploadedItems(): js.Array[FileItem] = js.native
  /**
    * Return items are ready to upload.
    */
  def getReadyItems(): js.Array[FileItem] = js.native
  /**
    * Returns true if value is {File}.
    */
  def isFile(value: js.Any): Boolean = js.native
  /**
    * Returns true if value is {FileLikeObject}.
    */
  def isFileLikeObject(value: js.Any): Boolean = js.native
  // **Callbacks**
  /**
    * Fires after adding all the dragged or selected files to the queue.
    */
  def onAfterAddingAll(addedItems: js.Array[FileItem]): Unit = js.native
  /**
    * Fires after adding a single file to the queue.
    */
  def onAfterAddingFile(item: FileItem): Unit = js.native
  /**
    * Fires before uploading an item.
    */
  def onBeforeUploadItem(item: FileItem): Unit = js.native
  /**
    * On cancel uploading
    */
  def onCancelItem(item: FileItem, response: Response, status: Double, headers: Headers): Unit = js.native
  /**
    * On all loaded when uploading an entire queue, or on file loaded when uploading a single independent file
    */
  def onCompleteAll(): Unit = js.native
  /**
    * On file upload complete (independently of the sucess of the operation)
    */
  def onCompleteItem(item: FileItem, response: Response, status: Double, headers: Headers): Unit = js.native
  /**
    * On upload error
    */
  def onErrorItem(item: FileItem, response: Response, status: Double, headers: Headers): Unit = js.native
  /**
    * On upload queue progress
    */
  def onProgressAll(progress: Double): Unit = js.native
  /**
    * On file upload progress.
    */
  def onProgressItem(item: FileItem, progress: Double): Unit = js.native
  /**
    * On file successfully uploaded
    */
  def onSuccessItem(item: FileItem, response: Response, status: Double, headers: Headers): Unit = js.native
  /**
    * When adding a file failed
    */
  def onWhenAddingFileFailed(item: FileItem, filter: Filter, options: js.Object): Unit = js.native
  def removeFromQueue(value: Double): Unit = js.native
  /**
    * Remove an item from the queue, where value is {FileItem} or index of item.
    */
  def removeFromQueue(value: FileItem): Unit = js.native
  /**
    * Upload all pending items on the queue.
    */
  def uploadAll(): Unit = js.native
  def uploadItem(value: Double): Unit = js.native
  /**
    * Uploads an item, where value is {FileItem} or index of item.
    */
  def uploadItem(value: FileItem): Unit = js.native
}

