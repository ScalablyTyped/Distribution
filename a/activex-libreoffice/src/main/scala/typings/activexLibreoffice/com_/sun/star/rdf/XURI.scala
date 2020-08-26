package typings.activexLibreoffice.com_.sun.star.rdf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents an {@link URI} node that may occur in a RDF graph.
  *
  * Note that this is actually an IRI, but the RDF literature speaks of {@link URIs} only, so we chose to use established terminology.
  *
  * The {@link URI} is split into a Namespace and a LocalName, using the first applicable of the following criteria:  1. after the first occurrence of the
  * fragment separator: "#" 2. after the last occurrence of the path separator: "/" 3. after the last occurrence of the scheme separator: ":" An {@link
  * URI} without a ":" is invalid. This implies that the Namespace part of an {@link URI} must not be empty, while the LocalName part may be empty.
  * @see XRepository
  * @since OOo 3.0
  */
@js.native
trait XURI extends XNode {
  var LocalName: String = js.native
  var Namespace: String = js.native
}

object XURI {
  @scala.inline
  def apply(LocalName: String, Namespace: String, StringValue: String): XURI = {
    val __obj = js.Dynamic.literal(LocalName = LocalName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[XURI]
  }
  @scala.inline
  implicit class XURIOps[Self <: XURI] (val x: Self) extends AnyVal {
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
    def setLocalName(value: String): Self = this.set("LocalName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("Namespace", value.asInstanceOf[js.Any])
  }
  
}

