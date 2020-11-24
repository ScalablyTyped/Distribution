package typings.androiduix.android.widget.RelativeLayout

import typings.androiduix.android.util.SparseMap
import typings.androiduix.android.view.View
import typings.androiduix.android.widget.RelativeLayout.DependencyGraph.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependencyGraph_ extends js.Object {
  
  def add(view: View): Unit = js.native
  
  def clear(): Unit = js.native
  
  /* private */ def findRoots(rulesFilter: js.Any): js.Any = js.native
  
  def getSortedViews(sorted: js.Array[View], rules: js.Array[Double]): Unit = js.native
  
  var mKeyNodes: SparseMap[String, Node] = js.native
  
  var mNodes: js.Any = js.native
  
  var mRoots: js.Any = js.native
}
object DependencyGraph_ {
  
  @scala.inline
  def apply(
    add: View => Unit,
    clear: () => Unit,
    findRoots: js.Any => js.Any,
    getSortedViews: (js.Array[View], js.Array[Double]) => Unit,
    mKeyNodes: SparseMap[String, Node],
    mNodes: js.Any,
    mRoots: js.Any
  ): DependencyGraph_ = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), findRoots = js.Any.fromFunction1(findRoots), getSortedViews = js.Any.fromFunction2(getSortedViews), mKeyNodes = mKeyNodes.asInstanceOf[js.Any], mNodes = mNodes.asInstanceOf[js.Any], mRoots = mRoots.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyGraph_]
  }
  
  @scala.inline
  implicit class DependencyGraph_Ops[Self <: DependencyGraph_] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: View => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindRoots(value: js.Any => js.Any): Self = this.set("findRoots", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSortedViews(value: (js.Array[View], js.Array[Double]) => Unit): Self = this.set("getSortedViews", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMKeyNodes(value: SparseMap[String, Node]): Self = this.set("mKeyNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMNodes(value: js.Any): Self = this.set("mNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMRoots(value: js.Any): Self = this.set("mRoots", value.asInstanceOf[js.Any])
  }
}
