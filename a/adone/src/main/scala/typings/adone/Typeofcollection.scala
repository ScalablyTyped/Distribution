package typings.adone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.adone.adoneNs.collectionNs.AVLTree
import typings.adone.adoneNs.collectionNs.AsyncQueue
import typings.adone.adoneNs.collectionNs.BinarySearchTree
import typings.adone.adoneNs.collectionNs.BufferList
import typings.adone.adoneNs.collectionNs.DefaultMap
import typings.adone.adoneNs.collectionNs.FastLRU
import typings.adone.adoneNs.collectionNs.INs.BinarySearchTreeNs.ConstructorOptions
import typings.adone.adoneNs.collectionNs.LRU
import typings.adone.adoneNs.collectionNs.MapCache
import typings.adone.adoneNs.collectionNs.NSCache
import typings.adone.adoneNs.collectionNs.RedBlackTree
import typings.adone.adoneNs.collectionNs.RefcountedCache
import typings.adone.adoneNs.collectionNs.Set
import typings.adone.adoneNs.collectionNs.TimeMap
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcollection extends js.Object {
  /**
    * Represents an AVL tree, a self-balancing binary search tree
    */
  var AVLTree: Instantiable1[
    js.UndefOr[
      /* options */ ConstructorOptions[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any, 
        typings.adone.adoneNs.collectionNs.AVLTree[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]
      ]
    ], 
    typings.adone.adoneNs.collectionNs.AVLTree[js.Object, js.Object]
  ]
  /**
    * Respresetns a data structure which is a combination of an array and a set.
    * Adding a new member is O(1), testing for membership is O(1),
    * and finding the index of an element is O(1).
    */
  var ArraySet: TypeofClassArraySet
  /**
    * Represents an asynchronous queue, each pop is a promise
    * that is resolved with an existing element or an element that will be pushed in the future
    */
  var AsyncQueue: Instantiable0[typings.adone.adoneNs.collectionNs.AsyncQueue[js.Object]]
  /**
    * Represents a binary search tree
    */
  var BinarySearchTree: Instantiable1[
    js.UndefOr[
      /* options */ ConstructorOptions[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any, 
        typings.adone.adoneNs.collectionNs.BinarySearchTree[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]
      ]
    ], 
    typings.adone.adoneNs.collectionNs.BinarySearchTree[js.Object, js.Object]
  ]
  /**
    * Represents a Node.js Buffer list collector, reader and streamer with callback/promise interface support
    */
  var BufferList: Instantiable0[typings.adone.adoneNs.collectionNs.BufferList]
  /**
    * Represents an array of bytes, enhanced Node.js Buffer
    */
  var ByteArray: TypeofClassByteArray
  /**
    * Represents a Map that has a default values factory object or function.
    * Each get of non-existent key goes through the factory
    */
  var DefaultMap: Instantiable2[
    js.UndefOr[
      (js.Function1[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
      ]) | (StringDictionary[/* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any])
    ], 
    js.UndefOr[
      /* iterable */ Iterable[
        js.Tuple2[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]
      ]
    ], 
    typings.adone.adoneNs.collectionNs.DefaultMap[js.Object, js.Object]
  ]
  /**
    * Represents a faster LRU cache but with less functionality
    */
  var FastLRU: Instantiable1[
    js.UndefOr[/* options */ Anon_DisposeKey], 
    typings.adone.adoneNs.collectionNs.FastLRU[js.Object, js.Object]
  ]
  val INs: TypeofIBinarySearchTree
  /**
    * Represent an LRU cache
    */
  var LRU: Instantiable1[
    js.UndefOr[
      /* options */ typings.adone.adoneNs.collectionNs.INs.LRUNs.ConstructorOptions[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
      ]
    ], 
    typings.adone.adoneNs.collectionNs.LRU[js.Object, js.Object]
  ]
  /**
    * Represents a linked list
    */
  var LinkedList: TypeofClassLinkedList
  var MapCache: Instantiable0[typings.adone.adoneNs.collectionNs.MapCache[js.Object]]
  var NSCache: Instantiable2[
    /* maxSize */ Double, 
    /* namespaces */ js.Array[String], 
    typings.adone.adoneNs.collectionNs.NSCache[js.Object]
  ]
  /**
    * Represents a priority queue
    */
  var PriorityQueue: TypeofClassPriorityQueue
  /**
    * Represents a queue
    */
  var Queue: TypeofClassQueue
  /**
    * Represents a fully persistent red-black tree
    */
  var RedBlackTree: Instantiable2[
    js.UndefOr[
      /* compare */ js.Function2[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* a */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* b */ js.Any, 
        Double
      ]
    ], 
    js.UndefOr[
      /* root */ typings.adone.adoneNs.collectionNs.RedBlackTree[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
      ]
    ], 
    typings.adone.adoneNs.collectionNs.RedBlackTree[js.Object, js.Object]
  ]
  var RefcountedCache: Instantiable0[typings.adone.adoneNs.collectionNs.RefcountedCache[js.Object]]
  var Set: Instantiable1[
    js.UndefOr[
      /* key */ js.Function1[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* x */ js.Any, 
        js.Any
      ]
    ], 
    typings.adone.adoneNs.collectionNs.Set[js.Object]
  ]
  /**
    * Represents a stack
    */
  var Stack: TypeofClassStack
  /**
    * Represents a Map that keeps keys only for a specified interval of time
    */
  var TimeMap: Instantiable2[
    js.UndefOr[/* timeout */ Double], 
    js.UndefOr[
      /* callback */ js.Function1[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* key */ js.Any, 
        Unit
      ]
    ], 
    typings.adone.adoneNs.collectionNs.TimeMap[js.Object, js.Object]
  ]
}

object Typeofcollection {
  @scala.inline
  def apply(
    AVLTree: Instantiable1[
      js.UndefOr[
        /* options */ ConstructorOptions[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any, 
          AVLTree[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
          ]
        ]
      ], 
      AVLTree[js.Object, js.Object]
    ],
    ArraySet: TypeofClassArraySet,
    AsyncQueue: Instantiable0[AsyncQueue[js.Object]],
    BinarySearchTree: Instantiable1[
      js.UndefOr[
        /* options */ ConstructorOptions[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any, 
          BinarySearchTree[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
          ]
        ]
      ], 
      BinarySearchTree[js.Object, js.Object]
    ],
    BufferList: Instantiable0[BufferList],
    ByteArray: TypeofClassByteArray,
    DefaultMap: Instantiable2[
      js.UndefOr[
        (js.Function1[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]) | (StringDictionary[/* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any])
      ], 
      js.UndefOr[
        /* iterable */ Iterable[
          js.Tuple2[
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
            /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
          ]
        ]
      ], 
      DefaultMap[js.Object, js.Object]
    ],
    FastLRU: Instantiable1[js.UndefOr[/* options */ Anon_DisposeKey], FastLRU[js.Object, js.Object]],
    INs: TypeofIBinarySearchTree,
    LRU: Instantiable1[
      js.UndefOr[
        /* options */ typings.adone.adoneNs.collectionNs.INs.LRUNs.ConstructorOptions[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]
      ], 
      LRU[js.Object, js.Object]
    ],
    LinkedList: TypeofClassLinkedList,
    MapCache: Instantiable0[MapCache[js.Object]],
    NSCache: Instantiable2[/* maxSize */ Double, /* namespaces */ js.Array[String], NSCache[js.Object]],
    PriorityQueue: TypeofClassPriorityQueue,
    Queue: TypeofClassQueue,
    RedBlackTree: Instantiable2[
      js.UndefOr[
        /* compare */ js.Function2[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* a */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* b */ js.Any, 
          Double
        ]
      ], 
      js.UndefOr[
        /* root */ RedBlackTree[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ js.Any, 
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam V */ js.Any
        ]
      ], 
      RedBlackTree[js.Object, js.Object]
    ],
    RefcountedCache: Instantiable0[RefcountedCache[js.Object]],
    Set: Instantiable1[
      js.UndefOr[
        /* key */ js.Function1[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* x */ js.Any, 
          js.Any
        ]
      ], 
      Set[js.Object]
    ],
    Stack: TypeofClassStack,
    TimeMap: Instantiable2[
      js.UndefOr[/* timeout */ Double], 
      js.UndefOr[
        /* callback */ js.Function1[
          /* import warning: RewrittenClass.unapply cls $anonfun was tparam K */ /* key */ js.Any, 
          Unit
        ]
      ], 
      TimeMap[js.Object, js.Object]
    ]
  ): Typeofcollection = {
    val __obj = js.Dynamic.literal(AVLTree = AVLTree, ArraySet = ArraySet, AsyncQueue = AsyncQueue, BinarySearchTree = BinarySearchTree, BufferList = BufferList, ByteArray = ByteArray, DefaultMap = DefaultMap, FastLRU = FastLRU, INs = INs, LRU = LRU, LinkedList = LinkedList, MapCache = MapCache, NSCache = NSCache, PriorityQueue = PriorityQueue, Queue = Queue, RedBlackTree = RedBlackTree, RefcountedCache = RefcountedCache, Set = Set, Stack = Stack, TimeMap = TimeMap)
  
    __obj.asInstanceOf[Typeofcollection]
  }
}

