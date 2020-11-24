package typings.androiduix.android.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicLayout extends Layout {
  
  /* private */ def addBlockAtOffset(offset: js.Any): js.Any = js.native
  
  /* private */ def createBlocks(): js.Any = js.native
  
  def getBlockEndLines(): js.Array[Double] = js.native
  
  def getBlockIndices(): js.Array[Double] = js.native
  
  def getIndexFirstChangedBlock(): Double = js.native
  
  def getNumberOfBlocks(): Double = js.native
  
  var mBase: js.Any = js.native
  
  var mBlockEndLines: js.Any = js.native
  
  var mBlockIndices: js.Any = js.native
  
  var mBottomPadding: js.Any = js.native
  
  var mDisplay: js.Any = js.native
  
  var mEllipsize: js.Any = js.native
  
  var mEllipsizeAt: js.Any = js.native
  
  var mEllipsizedWidth: js.Any = js.native
  
  var mIncludePad: js.Any = js.native
  
  var mIndexFirstChangedBlock: js.Any = js.native
  
  var mInts: js.Any = js.native
  
  var mNumberOfBlocks: js.Any = js.native
  
  var mObjects: js.Any = js.native
  
  var mTopPadding: js.Any = js.native
  
  var mWatcher: js.Any = js.native
  
  /* private */ def reflow(s: js.Any, where: js.Any, before: js.Any, after: js.Any): js.Any = js.native
  
  def setBlocksDataForTest(blockEndLines: js.Array[Double], blockIndices: js.Array[Double], numberOfBlocks: Double): Unit = js.native
  
  def setIndexFirstChangedBlock(i: Double): Unit = js.native
  
  def updateBlocks(startLine: Double, endLine: Double, newLineCount: Double): Unit = js.native
}
